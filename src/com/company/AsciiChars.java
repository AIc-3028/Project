package com.company;

public class AsciiChars {

    public static void printNumbers() {
        System.out.printf("Printing #...%n");

        for (int i = 48; i <= 57; i++) {
            char Num = (char) i;
        System.out.printf("Char with the value of %d: %c %n", i, Num);
        }
    }

    public static void printLowerCase()
    {
        System.out.printf("Printing Letters...%n");

        for (int i = 97; i <= 122; i++) {
            char Low = (char) i;
            System.out.printf("Char with the value of %d: %c %n", i, Low);
        }

}

    public static void printUpperCase()
    {
        System.out.printf("Printing Letters...%n");

        for (int i = 65; i <= 90; i++) {
            char Upp = (char) i;
            System.out.printf("Char with the value of %d: %c %n", i, Upp);
        }
    }
}
