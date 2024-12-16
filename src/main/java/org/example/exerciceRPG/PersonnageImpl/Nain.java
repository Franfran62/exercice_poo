package org.example.exerciceRPG.PersonnageImpl;

import org.example.exerciceRPG.WeaponImpl.Massue;
import org.example.exerciceRPG.abstracts.Personnage;

public class Nain extends Personnage {

    public Nain(String name, int life, int strength) {
        super(name, 15, 25, new Massue("Massue"));
    }
}
