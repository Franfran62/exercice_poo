package org.example.exerciceRPG.WeaponImpl;

import org.example.exerciceRPG.abstracts.Weapon;

public class Massue extends Weapon {

    public Massue() {
        super("Massue");
    }

    @Override
    public void attack() {
        System.out.println("Boum");
    }
}
