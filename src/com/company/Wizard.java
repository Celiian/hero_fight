package com.company;

import com.company.Archetypes;

public class Wizard implements Archetypes {
    protected int wizardDamage;
    protected String name;
    protected int damage;
    protected int hp;
    protected int speed;
    private int wizardDamageModified = wizardDamage;

    public Wizard(String name, int damage, int hp, int speed, int wizardDamage) {
        this.wizardDamage = wizardDamage;
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
    }


    public int getWizardDamage() {
        return wizardDamage;
    }

    public void setWizardDamage(int wizardDamage) {
        this.wizardDamage = wizardDamage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int takenDamage(int damage) {
        return damage;
    }

    @Override
    public int damageDone(int i) {
        if (i == 0){
            wizardDamageModified = wizardDamage;
        }
        int damageDone = this.damage + wizardDamageModified;
        this.wizardDamageModified /= 2;
        return damageDone;
    }

    @Override
    public String toString() {
        return "Hero " + name + " :  Atk = " + damage + "/ Hp = " + hp + "/ Speed = " + speed+ "/ WizardDammage = " + wizardDamage;
    }
}
