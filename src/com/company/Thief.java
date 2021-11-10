package com.company;

public class Thief extends Archetypes{
    protected int dodge;
    protected int critical;

    public Thief(String name, int damage, int hp, int speed, int dodge, int critical) {
        super(name, damage, hp, speed);
        this.dodge = dodge;
        this.critical = critical;
    }

    public int isDodge() {
        return dodge;
    }

    public int getCritical() {
        return critical;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public void setCritical(int critical) {
        this.critical = critical;
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
        return "Hero " + name + " :  Atk = " + damage + "/ Hp = " + hp + "/ Speed = " + speed + "/ Critical  = " + critical + "/ Dodge  = " + dodge;
    }
}