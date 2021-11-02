package com.hendisantika.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-multiple-security-config
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/3/2021
 * Time: 6:44 AM
 * To change this template use File | Settings | File Templates.
 */
@EnableWebSecurity
public class SpringSecurityConfig {
    @Configuration
    @Order(1)
    public class UserSpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            // @formatter:off
            http.antMatcher("/user/**")
                    .authorizeRequests()
                    .anyRequest().hasRole("USER")
                    .and()
                    .formLogin()
                    .loginPage("/user-login")
                    .failureUrl("/user-login?error")
                    .permitAll();
            // @formatter:on
        }
    }

    @Bean
    public static PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() throws Exception {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User
                .withUsername("user")
                .password(encoder().encode("user"))
                .roles("USER")
                .build());

        manager.createUser(User
                .withUsername("admin")
                .password(encoder().encode("admin"))
                .roles("ADMIN")
                .build());

        return manager;
    }
}
