package com.company;

public class Archetypes {
    protected String name;
    protected int damage;
    protected int hp;
    protected int speed;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

    public int takenDamage(int damage){
        this.hp = this.hp - damage;
        return this.hp;
    }


    @Override
    public String toString() {
        return "Hero " + name + " :  Atk = " + damage + "/ Hp = " + hp + "/ Speed = " + speed;
    }

    public Archetypes(String name, int damage, int hp, int speed) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
    }
}