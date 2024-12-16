package org.example.exerciceRPG.PersonnageImpl;

import org.example.exerciceRPG.WeaponImpl.Massue;
import org.example.exerciceRPG.abstracts.Personnage;
import org.example.exerciceRPG.abstracts.Weapon;

public class Barbare extends Personnage {

    public Barbare(String name, int life, int strength) {
        super(name, 20, 20, new Massue());
    }
}
