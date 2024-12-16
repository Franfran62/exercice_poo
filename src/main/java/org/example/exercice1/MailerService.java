package org.example.exercice1;

public class MailerService {
    public void sendConfirmationEmail(String email) {
        System.out.println(String.format("Envoi de l'email de confirmation à %s", email));
    }
}
