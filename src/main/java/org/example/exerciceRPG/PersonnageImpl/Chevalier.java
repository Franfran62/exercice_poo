package org.example.exerciceRPG.PersonnageImpl;

import org.example.exerciceRPG.WeaponImpl.Sword;
import org.example.exerciceRPG.abstracts.Personnage;

public class Chevalier extends Personnage {

    public Chevalier(String name, int life, int strength) {
        super(name, 10, 8, new Sword("Sword"));
    }
}
