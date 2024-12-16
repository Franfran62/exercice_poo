package org.example;

import org.example.exercice1.UserManager;
import org.example.exercice2.impl.Addition;
import org.example.exercice2.impl.Multiplication;
import org.example.exercice2.Operation;
import org.example.exercice2.impl.Soustraction;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Exercice 1
        UserManager userManager = new UserManager();
        userManager.registerUser("John", "johndoe@mail.com");

        // Exercice 2
        Collection<Operation> operations = List.of (
                new Addition(),
                new Soustraction(),
                new Multiplication()
        );
        for (var op : operations) {
            var a = 1;
            var b = 2;
            System.out.println(op.calcul(a, b));
        } }
}
