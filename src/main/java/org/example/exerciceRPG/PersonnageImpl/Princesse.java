package org.example.exerciceRPG.PersonnageImpl;

import org.example.exerciceRPG.WeaponImpl.Sword;
import org.example.exerciceRPG.abstracts.Personnage;

public class Princesse extends Personnage {

        public Princesse(String name, int life, int strength) {
            super(name, 12, 6, new Sword());
        }
}
