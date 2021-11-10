package com.company;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Archetypes> heroList = new ArrayList<Archetypes>();



        System.out.println("Application has started");

        boolean gameRunning = true;

        while (gameRunning){

            int choiceInt = 5;
            boolean choiceDone = false;
            while (!choiceDone) {
                try {
                    System.out.println("Let the game Game start !!");
                    System.out.println("What do you want to do ?");
                    System.out.println("1 : Create a hero");
                    System.out.println("2 : List of hero");
                    //System.out.println("3 : Hero fight");
                    //System.out.println("4 : Delete a Hero");
                    System.out.println("5 : Leave");
                    choiceInt = sc.nextInt();
                    choiceDone = true;
                } catch (InputMismatchException e) {
                    System.out.println("Please choose an integer");
                    sc.next();
                }
            }
            if (choiceInt == 5){
                gameRunning = false;
            }

            if(choiceInt == 1){


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
            }

            if (choiceInt == 2){
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





        }
        System.out.println("Application has ended");
    }
}
