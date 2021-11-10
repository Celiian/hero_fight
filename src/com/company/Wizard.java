package com.company;

import com.company.Archetypes;

public class Wizard extends Archetypes {
    protected int wizardDamage;

    public Wizard(String name, int damage, int hp, int speed, int wizardDamage) {
        super(name, damage, hp, speed);
        this.wizardDamage = wizardDamage;
    }

    public int getWizardDamage() {
        return wizardDamage;
    }

    public void setWizardDamage(int wizardDamage) {
        this.wizardDamage = wizardDamage;
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    @Override
    public String toString() {
        return "Hero " + name + " :  Atk = " + damage + "/ Hp = " + hp + "/ Speed = " + speed+ "/ WizardDammage = " + wizardDamage;
    }
}
