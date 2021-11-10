package com.company;

import com.company.Archetypes;

public class Warrior extends Archetypes {
    protected int shield;

    public Warrior(String name, int damage, int hp, int speed, int shield) {
        super(name, damage, hp, speed);
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    public void setName(String name) {

        super.setName(name);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    public void setHp(int hp){
        super.setHp(hp);
    }

    @Override
    public String toString() {
        return "Hero " + name + " :  Atk = " + damage + "/ Hp = " + hp + "/ Speed = " + speed+ "/ Shield = " + shield;
    }
}