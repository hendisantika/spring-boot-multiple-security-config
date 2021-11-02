package com.hendisantika;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-multiple-security-config
 * User: TOSHIBA
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 11/3/2021
 * Time: 6:39 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class ApplicationController {
    @GetMapping("/user/view")
    public String userView() {
        return "user";
    }

    @GetMapping("/admin/view")
    public String adminView() {
        return "admin";
    }

    @GetMapping("/user-login")
    public String userLoginView() {
        return "login-user";
    }
}
