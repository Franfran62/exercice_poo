package org.example.exerciceRPG.abstracts;

import org.example.exerciceRPG.interfaces.Scallable;

public abstract class Personnage implements Scallable {

    private String name;
    private int life;
    private int strength;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Personnage(String name, int life, int strength, Weapon weapon) {
        this.name = name;
        this.life = life;
        this.strength = strength;
        this.weapon = weapon;
    }

    public Personnage(String name, int life, int strength) {
        this.name = name;
        this.life = life;
        this.strength = strength;
    }

    @Override
    public void levelUp() {
        this.life += 1;
        this.strength += 1;
    }
}
