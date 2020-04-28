package com.company;

import java.util.Scanner;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;



public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");

        String formattedDate = date.format(format);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name? ");     // type a word and hit enter
        String Username = scanner.next();
        System.out.printf("Greetings " + Username + ". Today is " + formattedDate + "%n");

        //Asking
        System.out.println("Do you wish to continue? (yes) or (y)");
        String Reply1 = scanner.next();

        if (Reply1.compareTo("yes") == 0 || Reply1.compareTo("y") == 0){
            System.out.println("Continuing");
//            Lottery.runLottery();
        } else {
            System.out.println("Understood. Complete the survey at a later date.");
        }


    }
}

