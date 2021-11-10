package com.company;

public class Neutral implements Archetypes {
    protected String name;
    protected int atk;
    protected int hp;
    protected int speed;

    public Neutral(String name, int atk, int hp, int speed) {
        this.name = name;
        this.atk = atk;
        this.hp = hp;
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return atk;
    }

    public void setDamage(int damage) {
        this.atk = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int takenDamage(int damage) {
        return damage;
    }

    @Override
    public int damageDone(int i) {
        return this.atk;
    }


    @Override public String toString() {
        return "Hero " + name + " :  Atk = " + atk + "/ Hp = " + hp + "/ Speed = " + speed;
    }


}