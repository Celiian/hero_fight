package com.company;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class choiceFunctions {

    static Scanner sc = new Scanner(System.in);

    public static List<Archetypes> choice1(int choiceInt, boolean choiceDone, List<Archetypes> heroList){


        Archetypes hero = GameFunctions.characterBaseCreate();



        heroList.add(hero);
        return heroList;
    }

    public static void choice2(int choiceInt, boolean choiceDone, List<Archetypes> heroList){
        if (heroList.size() == 0){
            System.out.println("There isn't any Hero yet... You need to create some");
            return;
        }
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
                System.out.println("You have chosen " + heroList.get(choiceFirstHero).getName() + " as first hero");
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
                System.out.println("You have chosen " + heroList.get(choiceSecondHero).getName() + " as second hero");
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

    public static List<Archetypes> choice4(List<Archetypes> heroList) {
        String choiceStr = "n";
        int choiceInt = 0;
        boolean choiceDone = false;
        if (heroList.size() == 0){
            System.out.println("There isn't any Hero yet... You need to create some");
            return heroList;
        }
        for(int i = 0; i < heroList.size() ; i++) {
            System.out.println(i + " - " + heroList.get(i).getName());
        }
        try {
            System.out.println("Which Hero do you want to delete ?");
            choiceInt = sc.nextInt();
            if (choiceInt < heroList.size()) {
                System.out.println("You have deleted " + heroList.get(choiceInt).getName());
                heroList.remove(heroList.get(choiceInt));
                for(int i = 0; i < heroList.size() ; i++) {
                    System.out.println(i + " - " + heroList.get(i).getName());
                }
            } else {
                System.out.println("Please choose a valid hero");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid option");
            sc.next();
        }
        try {
            System.out.println("Do you want to delete an other Hero ? (y / n )");
            choiceStr = sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid option");
            sc.next();
        }

        if (choiceStr.equals("y")) {
            if (heroList.size() == 0){
                System.out.println("There isn't any Hero yet... You need to create some");
                return heroList;
            }

            for(int i = 0; i < heroList.size() ; i++) {
                System.out.println(i + " - " + heroList.get(i).getName());
            }
            while (!choiceDone) {
                if (heroList.size() == 0){
                    System.out.println("There isn't any Hero yet... You need to create some");
                    return heroList;
                }
                try {
                    System.out.println("Which Hero do you want to delete ?");
                    choiceInt = sc.nextInt();
                    if (choiceInt < heroList.size()) {
                        System.out.println("You have deleted " + heroList.get(choiceInt).getName());
                        heroList.remove(heroList.get(choiceInt));
                        for(int i = 0; i < heroList.size() ; i++) {
                            System.out.println(i + " - " + heroList.get(i).getName());
                        }
                    } else {
                        System.out.println("Please choose a valid hero");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid option");
                    sc.next();
                }
                try {
                    System.out.println("Do you want to delete an other Hero ? (y / n )");
                    choiceStr = sc.next();
                }
                catch (InputMismatchException e){
                    System.out.println("Please enter a valid option");
                    sc.next();
                }
                if (choiceStr.equals(("n"))){
                    choiceDone = true;
                }
            }
        }
        return heroList;
    }
}
