package com.company;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class GameFunctions {

    static Scanner sc = new Scanner(System.in);


    public static Archetypes characterBaseCreate(){
        int choiceInt = 0;
        boolean choiceDone;
        System.out.println("Please choose a Hero name");
        String name = sc.next();
        int atk = 10;
        int hp = 100;
        int speed = 30;
        System.out.println("Your Hero have : " + atk + " atk / " + hp + " hp / " + speed + " speed");

        String choiceStr = "n";
        try{
            System.out.println("Do you want to change a stat of your hero ? (y / n)");
            choiceStr = sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid option");
            sc.next();
        }
        if (Objects.equals(choiceStr, "y")){
            choiceDone = false;
            while(!choiceDone) {

                try{
                    System.out.println("Which Stat do you want to change ? ( atk / hp / speed / none )");
                    choiceStr = sc.next();
                }
                catch (InputMismatchException e){
                    System.out.println("Please enter a valid option");
                    sc.next();
                }
                if (choiceStr.equals("atk")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        atk = choiceInt;
                        System.out.println("Your Hero now have : " + atk + " atk");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("hp")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        hp = choiceInt;
                        System.out.println("Your Hero now have : " + hp + " hp");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("speed")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        speed = choiceInt;
                        System.out.println("Your Hero now have : " + speed + " speed");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("none")) {
                    choiceDone = true;
                }
                else {
                    System.out.println("Please choose a valid option");
                }
            }
            System.out.println("Your Hero now have : " + atk + " atk / " + hp + " hp / " + speed + " speed");
        }

        Archetypes hero = new Archetypes(name, atk, hp, speed);
        return hero;
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

    public static Warrior characterWarriorCreate(){
        int choiceInt = 0;
        boolean choiceDone;
        System.out.println("Please choose a Hero name");
        String name = sc.next();
        int atk = 10;
        int hp = 100;
        int speed = 30;
        int shield = 5;
        System.out.println("Your Hero have : " + atk + " atk / " + hp + " hp / " + speed + " speed" + shield + " shield");

        String choiceStr = "n";
        try{
            System.out.println("Do you want to change a stat of your hero ? (y / n)");
            choiceStr = sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid option");
            sc.next();
        }
        if (Objects.equals(choiceStr, "y")){
            choiceDone = false;
            while(!choiceDone) {

                try{
                    System.out.println("Which Stat do you want to change ? ( atk / hp / speed / shield / none )");
                    choiceStr = sc.next();
                }
                catch (InputMismatchException e){
                    System.out.println("Please enter a valid option");
                    sc.next();
                }
                if (choiceStr.equals("atk")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        atk = choiceInt;
                        System.out.println("Your Hero now have : " + atk + " atk");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("hp")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        hp = choiceInt;
                        System.out.println("Your Hero now have : " + hp + " hp");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("speed")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        speed = choiceInt;
                        System.out.println("Your Hero now have : " + speed + " speed");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }
                } else if (choiceStr.equals("shield")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        shield = choiceInt;
                        System.out.println("Your Hero now have : " + shield + " shield");

                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }
                }else if (choiceStr.equals("none")) {
                    choiceDone = true;
                }
                else {
                    System.out.println("Please choose a valid option");
                }
            }
            System.out.println("Your Hero now have : " + atk + " atk / " + hp + " hp / " + speed + " speed" + shield + " shield");
        }


        Warrior warrior = new Warrior(name, atk, hp, speed, shield);
        return warrior;
    }

    public static Wizard characterWizardCreate(){
        int choiceInt = 0;
        boolean choiceDone;
        System.out.println("Please choose a Hero name");
        String name = sc.next();
        int atk = 10;
        int hp = 100;
        int speed = 30;
        int mana= 15;
        System.out.println("Your Hero have : " + atk + " atk / " + hp + " hp / " + speed + " speed / " + mana + " mana");

        String choiceStr = "n";
        try{
            System.out.println("Do you want to change a stat of your hero ? (y / n)");
            choiceStr = sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid option");
            sc.next();
        }
        if (Objects.equals(choiceStr, "y")){
            choiceDone = false;
            while(!choiceDone) {

                try{
                    System.out.println("Which Stat do you want to change ? ( atk / hp / speed / mana /none )");
                    choiceStr = sc.next();
                }
                catch (InputMismatchException e){
                    System.out.println("Please enter a valid option");
                    sc.next();
                }
                if (choiceStr.equals("atk")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        atk = choiceInt;
                        System.out.println("Your Hero now have : " + atk + " atk");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("hp")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        hp = choiceInt;
                        System.out.println("Your Hero now have : " + hp + " hp");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("speed")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        speed = choiceInt;
                        System.out.println("Your Hero now have : " + speed + " speed");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("mana")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        mana = choiceInt;
                        System.out.println("Your Hero now have : " + mana + " mana");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("none")) {
                    choiceDone = true;
                }
                else {
                    System.out.println("Please choose a valid option");
                }
            }
            System.out.println("Your Hero now have : " + atk + " atk / " + hp + " hp / " + speed + " speed /" + mana + " mana");
        }
        Wizard wizard = new Wizard(name, atk, hp, speed, mana);
        return wizard;
    }
    public static Thief characterThiefCreate(){
        int choiceInt = 0;
        boolean choiceDone;
        System.out.println("Please choose a Hero name");
        String name = sc.next();
        int atk = 10;
        int hp = 100;
        int speed = 30;
        int critical = 30;
        int dodge = 20;
        System.out.println("Your Hero have : " + atk + " atk / " + hp + " hp / " + speed + " speed / " + critical + " critical (max : 100) /" + dodge + " dodge (max : 100)");

        String choiceStr = "n";
        try{
            System.out.println("Do you want to change a stat of your hero ? (y / n)");
            choiceStr = sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid option");
            sc.next();
        }
        if (Objects.equals(choiceStr, "y")){
            choiceDone = false;
            while(!choiceDone) {

                try{
                    System.out.println("Which Stat do you want to change ? ( atk / hp / speed / critical / dodge / none )");
                    choiceStr = sc.next();
                }
                catch (InputMismatchException e){
                    System.out.println("Please enter a valid option");
                    sc.next();
                }
                if (choiceStr.equals("atk")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        atk = choiceInt;
                        System.out.println("Your Hero now have : " + atk + " atk");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("hp")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        hp = choiceInt;
                        System.out.println("Your Hero now have : " + hp + " hp");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("speed")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        speed = choiceInt;
                        System.out.println("Your Hero now have : " + speed + " speed");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("critical")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        if (choiceInt > 100){
                            choiceInt = 100;
                        }
                        critical = choiceInt;
                        System.out.println("Your Hero now have : " + critical + " critical");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("dodge")) {
                    try {
                        System.out.println("Please enter the new value");
                        choiceInt = sc.nextInt();
                        if (choiceInt > 100){
                            choiceInt = 100;
                        }
                        dodge = choiceInt;
                        System.out.println("Your Hero now have : " + dodge + " dodge");

                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid option");
                        sc.next();
                    }

                } else if (choiceStr.equals("none")) {
                    choiceDone = true;
                }
                else {
                    System.out.println("Please choose a valid option");
                }
            }
            System.out.println("Your Hero have : " + atk + " atk / " + hp + " hp / " + speed + " speed / " + critical + " critical (max : 100) /" + dodge + " dodge (max : 100)");
        }
        Thief thief = new Thief(name, atk, hp, speed, critical, dodge);
        return thief;
    }
}
