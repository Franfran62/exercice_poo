package org.example.exerciceRPG.PersonnageImpl;

import org.example.exerciceRPG.WeaponImpl.Sword;
import org.example.exerciceRPG.abstracts.Personnage;

public class Troll extends Personnage {

    public Troll(String name, int life, int strength) {
        super(name, 99, 99, new Sword("Sword"));
    }
}
