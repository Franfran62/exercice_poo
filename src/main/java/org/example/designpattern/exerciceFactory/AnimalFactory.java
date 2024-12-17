package org.example.designpattern.exerciceFactory;

public class AnimalFactory {

    private static final String PACKAGES = "org.example.designpattern.exerciceFactory.";

    public static Animal createAnimal(String className, String animalName) {
        try {
            Class<?> clazz = Class.forName(PACKAGES+className);
            return (Animal) clazz.getDeclaredConstructor(String.class).newInstance(animalName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}