# spring-boot-multiple-security-config

### Multiple login page with Spring Security

In real projects, you may encounter some cases where the application needs to use two different login methods depending
on the user’s role, for example, there are applications that will need normal users to login using tokens or QR code,
and admin login using username and password. How to implement multiple login pages using Spring Security? I will guide
you in this sample.

### Things todo list:

1. Clone the repository: `git clone https://github.com/hendisantika/spring-boot-multiple-security-config.git`
2. Navigate to the folder: `cd spring-boot-multiple-security-config`
3. Run the application: `mvn clean spring-boot:run`
4. Open your favorite browser: http://localhost:8080/user/view
5. Open your favorite browser: http://localhost:8080/admin/view
6. Use these users: `user/user` or `admin/admin`

### Images Screen shot

User Login

![User Login](img/user-login.png "User Login")

![User Login](img/login.png "User Login")

User Page

![User Page](img/user.png "User Page")

Admin Page

![Admin Page](img/admin.png "Admin Page")__

