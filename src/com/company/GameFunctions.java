package com.company;

public class GameFunctions {

    public static Archetypes characterBaseCreate(String name, int damage, int hp, int speed){
        Archetypes archetypes = new Archetypes(name, damage, hp, speed);
        return archetypes;
    }

    public static Archetypes fight(Archetypes hero_atk, Archetypes hero_def){
        int dmg_done = hero_atk.getDamage();
        hero_def.setHp(hero_def.getHp() - dmg_done);
        if (hero_def.getHp() < 0){
            hero_def.setHp(0);
        }
        System.out.println(hero_atk.getName() + " did " + hero_atk.getDamage() + " to " + hero_def.getName() + " !");
        System.out.println("Now " +  hero_def.getName() + " have " + hero_def.getHp() + " hp left");

        return hero_def;
    }





}
