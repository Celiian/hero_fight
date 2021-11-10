package com.company;

public class Thief implements Archetypes{
    protected int dodge;
    protected int critical;
    protected String name;
    protected int damage;
    protected int hp;
    protected int speed;
    private boolean crit = false;


    public Thief(String name, int damage, int hp, int speed, int dodge, int critical) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
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

    public int getDodge() {
        return dodge;
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
        int damagetaken = damage;
        double randNumber = Math.random();
        double dodge = randNumber * 100;
        dodge = (int)dodge;
        if (dodge < this.dodge){
            damagetaken = 0;
            System.out.println(this.name + " have dodged the attack !!");
        }
        return damagetaken;
    }


    public int damageDone(int i) {
        if(i == 0){
            this.crit = false;
        }
        int damageDone = this.damage;
        if (!this.crit) {
            double randNumber = Math.random();
            double crit = randNumber * 100;
            crit = (int) crit;

            if (crit < this.critical) {
                damageDone = this.damage * 2;
                this.crit = true;
                System.out.println(this.name + " have made a critical attack !!");
            }
        }
        else if (this.crit){
            this.crit = false;
        }
        return damageDone;
    }

    @Override
    public String toString() {
        return "Hero " + name + " :  Atk = " + damage + "/ Hp = " + hp + "/ Speed = " + speed + "/ Critical  = " + critical + "/ Dodge  = " + dodge;
    }
}