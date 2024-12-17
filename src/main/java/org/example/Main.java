package org.example;

import org.example.designpattern.exerciceFactory.Animal;
import org.example.designpattern.exerciceFactory.AnimalFactory;
import org.example.designpattern.exerciceFactory.Dog;
import org.example.exercice1.UserManager;
import org.example.exercice2.impl.Addition;
import org.example.exercice2.impl.Multiplication;
import org.example.exercice2.Operation;
import org.example.exercice2.impl.Soustraction;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Exercice Factory
        Animal dog = AnimalFactory.createAnimal("Dog", "Yoshi");
        dog.animalSound();
    }

}
