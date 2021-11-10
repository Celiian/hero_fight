package com.company;

import java.util.*;

public class choiceFunctions {

    static Scanner sc = new Scanner(System.in);

    public static List<Archetypes> choice1(int choiceInt, boolean choiceDone, List<Archetypes> heroList){

        int choiceArc = 0;
        boolean validOption = false;
        while (!validOption){
            try {
                System.out.println("Please choose a archetype : 1 : Default | 2 : Warrior | 3 : Wizard | 4 : Thief");
                choiceArc = sc.nextInt();
                validOption = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid option");
                sc.next();
            }
        }

        if (choiceArc == 1){
            heroList.add(GameFunctions.characterBaseCreate());
        } else if (choiceArc == 2){
            heroList.add(GameFunctions.characterWarriorCreate());
        } else if (choiceArc == 3){
            heroList.add(GameFunctions.characterWizardCreate());
        } else if (choiceArc == 4){
            heroList.add(GameFunctions.characterThiefCreate());}


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

    public static void choice3(List<Archetypes> heroList, List<String> historicalFight) {
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
        int hero1Hp = hero1.getHp();
        Archetypes hero2 = secondHero;
        int hero2Hp = hero2.getHp();
        Archetypes hero3;
        int hero3Hp;

        if(firstHero.getSpeed() < secondHero.getSpeed()) {
            hero1 = secondHero;
            hero2 = firstHero;
        }

        int i = 0;
        while (!fightEnded) {

            if (hero1Hp <= 0){
                System.out.println(hero1.getName() + " lost the fight !!");
                String historicalWin = (hero2.getName() + " à tué " + hero1.getName() + " en " + i + " tours");
                historicalFight.add(historicalWin);
                break;
            }
            if (hero2Hp <= 0){
                System.out.println(hero2.getName() + " lost the fight !!");
                String historicalWin = (hero1.getName() + " à tué " + hero2.getName() + " en " + i + " tours");
                historicalFight.add(historicalWin);
                break;
            }

            hero2Hp = GameFunctions.fight(hero1, hero2, hero2Hp, i);

            hero3 = hero1;
            hero3Hp = hero1Hp;
            hero1 = hero2;
            hero1Hp = hero2Hp;
            hero2 = hero3;
            hero2Hp = hero3Hp;
            i ++;
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

    public static void choice5(List<String> historicalFight) {
        if(historicalFight.size() != 0) {
            for (int i = 0; i < historicalFight.size(); i++) {
                System.out.println(historicalFight.get(i));
            }
        }
        else{
            System.out.println("The fight Historical is empty... Please start a fight");
        }
        System.out.println("");
    }

    public static List<Archetypes> choice7(List<String> lineList, List<Archetypes> heroList) {
        Map<Integer, Map<String, String>> heroTab = new HashMap<>();


        lineList = file.file();
        int a =0;
        for(int i = 0; i<lineList.size(); i ++){
            heroTab = file.read(lineList.get(i), heroTab, a);
            a++;
        }
        System.out.println(heroTab);

        int y = 0;
        String name = "";
        int atk = 10;
        int hp = 100;
        int speed = 30;
        int dodge = 30;
        int crit = 30;
        int mana = 20;
        int shield = 5;
        for (Map.Entry m : heroTab.entrySet()) {
            Map<String, String> dict = heroTab.get(y);
            y++;
            for (Map.Entry n : dict.entrySet()) {
                String key = String.valueOf(n.getKey());
                String value = String.valueOf(n.getValue());
                ArrayList<String> liste = new ArrayList<String>();
                liste = file.separator(String.valueOf(n));
                    if (liste.get(0).equals("name")) {
                        name = liste.get(1);
                    }
                    if (liste.get(0).equals("hp")) {
                        hp = Integer.parseInt(liste.get(1));
                    }
                    if (m.getKey().equals("atk")) {
                        atk = (int) m.getValue();
                    }
                    if (m.getKey().equals("speed")) {
                        speed = (int) m.getValue();
                    }
                    if (m.getKey().equals("dodge")) {
                        dodge = (int) m.getValue();
                    }
                    if (m.getKey().equals("crit")) {
                        crit = (int) m.getValue();
                    }
                    if (m.getKey().equals("mana")) {
                        mana = (int) m.getValue();
                    }
                    if (m.getKey().equals("shield")) {
                        shield = (int) m.getValue();
                    }
                    if (key.equals("class")) {
                        if (value.equals("thief")) {
                            Thief thief = new Thief(name, atk, hp, speed, dodge, crit);
                            heroList.add(thief);
                        }
                        if (value.equals("warrior")) {
                            Warrior warrior = new Warrior(name, atk, hp, speed, shield);
                            heroList.add(warrior);
                        }
                        if (value.equals("wizard")) {
                            Wizard wizard = new Wizard(name, atk, hp, speed, mana);
                            heroList.add(wizard);
                        }
                        if (value.equals("neutral")) {
                            Neutral hero = new Neutral(name, atk, hp, speed);
                            heroList.add(hero);
                        }
                    }
                }
        }
        return heroList;
    }
}