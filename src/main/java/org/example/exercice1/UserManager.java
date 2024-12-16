package org.example.exercice1;

public class UserManager {

    private UserService userService = new UserService();
    private MailerService mailerService = new MailerService();

    public void registerUser(String name, String email) {
        userService.save(name, email);
        mailerService.sendConfirmationEmail(email);
    }
}
