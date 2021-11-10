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
                    System.out.println("3 : Hero fight");
                    System.out.println("4 : Delete a Hero");
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
                heroList = choiceFunctions.choice1(choiceInt, choiceDone, heroList);
            }

            if (choiceInt == 2){
                choiceFunctions.choice2(choiceInt, choiceDone, heroList);
            }

            if (choiceInt == 3){
                choiceFunctions.choice3(heroList);
            }

            if (choiceInt == 4){
                heroList = choiceFunctions.choice4(heroList);
            }





        }
        System.out.println("Application has ended");
    }
}
