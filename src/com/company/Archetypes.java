package com.company;

public class Archetypes {
    private String name;
    private int damage;
    private int hp;
    private int speed;

    public int getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
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