package org.example.exerciceRPG.PersonnageImpl;

import org.example.exerciceRPG.WeaponImpl.Sword;
import org.example.exerciceRPG.abstracts.Personnage;
import org.example.exerciceRPG.abstracts.Weapon;

public class Magicien extends Personnage {

    private Weapon weapon;

    public Magicien(String name, int life, int strength) {
        super(name, 15, 3, new Sword());

    }
}
