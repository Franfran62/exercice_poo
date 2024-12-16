package org.example.exerciceRPG.WeaponImpl;

import org.example.exerciceRPG.abstracts.Weapon;

public class Massue extends Weapon {
    public Massue(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Boum");
    }
}
