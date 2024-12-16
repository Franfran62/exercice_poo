package org.example.exerciceRPG.WeaponImpl;

import org.example.exerciceRPG.abstracts.Weapon;

public class Sword extends Weapon {
    public Sword(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Yahhh");
    }
}
