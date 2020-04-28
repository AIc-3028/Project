package com.company;

import java.util.Scanner;

public class Lottery {

    static String petName;
    static int petAge;
    static int luckyNum;
    static int jerseyNum;
    static int modelYear;
    static String actorName;
    static int pickNum;
    static String quarterback;
    static int magicBall;

    public static void testMethod(){
        System.out.println("Testing...");
    }

    public static int numConvert(int num){
        while (num > 65){
            num = num/2;
        }
        return num;
    }

    public static void runLottery(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting survey");
        System.out.println("What is your pet's name?");
        petName = scanner.nextLine();
        System.out.println("What is your pet's Age?");
        petAge = scanner.nextInt();
        System.out.println("What is your lucky number?");
        luckyNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you have a favorite quarterback? (Y/N)");
        quarterback = scanner.nextLine();
        if (quarterback.compareTo("Y") == 0){
            System.out.println("What is their jersey number?");
            jerseyNum = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("What is the two-digit model year of your car?");
        modelYear = scanner.nextInt();
        System.out.println("What is the name of your favorite actor?");
        actorName = scanner.next();
        System.out.println("Pick a number between 1-50");
        pickNum = scanner.nextInt();

        System.out.printf("Here are your answers: %s, %d, %d, %d, %s, %d %n", petName, petAge, luckyNum, modelYear, actorName, pickNum);

        int Ran1 = (int)(10.0 * Math.random());
        int Ran2 = (int)(10.0 * Math.random());
        int Ran3 = (int)(10.0 * Math.random());

        System.out.printf("Here are your Random Numbers: %d, %d, %d %n", Ran1, Ran2, Ran3);

        if (quarterback.compareTo("yes") == 0 || quarterback.compareTo("y") == 0){
            magicBall = jerseyNum * Ran1;
        } else {
            magicBall = luckyNum * Ran1;
        }

        if  (magicBall > 75){
            magicBall -= 75;
        }

        int lottery1 = petName.charAt(2);
        int lottery2 = (luckyNum + modelYear);
        int lottery3 = (pickNum - Ran1);
        int lottery4 = (actorName.charAt(0));
        int lottery5 = (actorName.charAt(actorName.length() - 1));
        int lottery6 = 42;
        int lottery7 = (petAge + modelYear);
        int lottery8;
        if (quarterback.compareTo("yes") == 0 || quarterback.compareTo("y") == 0){
            lottery8 = (jerseyNum + petAge + modelYear);
        } else {
            lottery8 = (petAge + luckyNum);
        }

        System.out.printf("Here are your lottery numbers: %d %d %d %d %d %d %d %d! Magic ball number: %d",
                numConvert(lottery1),
                numConvert(lottery2),
                numConvert(lottery3),
                numConvert(lottery4),
                numConvert(lottery5),
                numConvert(lottery6),
                numConvert(lottery7),
                numConvert(lottery8),
                magicBall);


    }

}
