package com.company;

import com.company.Archetypes;

public class Warrior implements Archetypes {
    protected int shield;
    protected String name;
    protected int damage;
    protected int hp;
    protected int speed;

    public Warrior(String name, int damage, int hp, int speed, int shield) {
        this.shield = shield;
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
    }


    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
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
        int damageTaken = damage - this.shield;
        return damageTaken;
    }

    @Override
    public int damageDone(int i) {
        return damage;
    }

    @Override
    public String toString() {
        return "Hero " + name + " :  Atk = " + damage + "/ Hp = " + hp + "/ Speed = " + speed+ "/ Shield = " + shield;
    }
}