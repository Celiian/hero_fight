package com.company;

public class Thief extends Archetypes{
    protected boolean dodge;
    protected int critalDommage;

    public Thief(String name, int damage, int hp, int speed) {
        super(name, damage, hp, speed);
        this.dodge = dodge;
        this.critalDommage = critalDommage;
    }

    public boolean isDodge() {
        return dodge;
    }

    public int getCritalDommage() {
        return critalDommage;
    }

    public void setDodge(boolean dodge) {
        this.dodge = dodge;
    }

    public void setCritalDommage(int critalDommage) {
        this.critalDommage = critalDommage;
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
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

    @Override
    public String toString() {
        return "Hero " + name + " :  Atk = " + damage + "/ Hp = " + hp + "/ Speed = " + speed;
    }
}