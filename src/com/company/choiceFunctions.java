package com.company;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class choiceFunctions {

    static Scanner sc = new Scanner(System.in);

    public static List<Archetypes> choice1(int choiceInt, boolean choiceDone, List<Archetypes> heroList){

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

        Archetypes hero = GameFunctions.characterBaseCreate(name, atk, hp, speed);
        heroList.add(hero);
        return heroList;
    }

    public static void choice2(int choiceInt, boolean choiceDone, List<Archetypes> heroList){
        for(int i = 0; i < heroList.size() ; i++) {
            System.out.println(i + " - " + heroList.get(i).getName());
        }
        String choiceStr = "n";
        try{
            System.out.println("Do you want to see the detailed stat of a hero ? (y / n)");
            choiceStr = sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid option");
            sc.next();
        }

        if (choiceStr.equals("y")) {
            choiceDone = false;
            while (!choiceDone) {
                try {
                    System.out.println("Please choose a hero");
                    choiceInt = sc.nextInt();
                    if (choiceInt < heroList.size()) {
                        System.out.println(heroList.get(choiceInt));
                    } else {
                        System.out.println("Please choose a valid hero");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid option");
                    sc.next();
                }
                try{
                    System.out.println("Do you want to see the detailed stat of an other hero ? (y / n)");
                    choiceStr = sc.next();
                }
                catch (InputMismatchException e){
                    System.out.println("Please enter a valid option");
                    sc.next();
                }
                if (choiceStr.equals("n")){
                    choiceDone = true;
                }
            }
        }
    }

    public static void choice3(List<Archetypes> heroList) {
        int choiceFirstHero = 0;
        int choiceSecondHero = 0;


        for (int i = 0; i < heroList.size(); i++) {
            System.out.println(i + " - " + heroList.get(i).getName());
        }

        try {
            System.out.println("Which Hero do you want to fight ( choose the first one)");
            choiceFirstHero = sc.nextInt();
            if (choiceFirstHero < heroList.size()) {
                System.out.println("You choosed " + heroList.get(choiceFirstHero).getName() + " as first hero");
            } else {
                System.out.println("Please choose a valid hero");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid option");
            sc.next();

        }
        try {
            System.out.println("Which Hero do you want to fight ( choose the second one)");
            choiceSecondHero = sc.nextInt();
            if (choiceSecondHero < heroList.size()) {
                System.out.println("You choosed " + heroList.get(choiceSecondHero).getName() + " as second hero");
            } else {
                System.out.println("Please choose a valid hero");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid option");
            sc.next();

        }
        boolean fightEnded = false;

        Archetypes firstHero = heroList.get(choiceFirstHero);
        Archetypes secondHero = heroList.get(choiceSecondHero);
        Archetypes hero1 = firstHero;
        Archetypes hero2 = secondHero;
        Archetypes hero3;

        if(firstHero.getSpeed() < secondHero.getSpeed()) {
            hero1 = secondHero;
            hero2 = firstHero;
        }


        while (!fightEnded) {
            if (hero1.getHp() <= 0){
                System.out.println(hero1.getName() + " lost the fight !!");
                fightEnded = true;
                break;
            }
            if (hero2.getHp() <= 0){
                System.out.println(hero2.getName() + " lost the fight !!");
                fightEnded = true;
                break;
            }

            hero2 = GameFunctions.fight(hero1, hero2);

            hero3 = hero1;
            hero1 = hero2;
            hero2 = hero3;

        }
    }
}
