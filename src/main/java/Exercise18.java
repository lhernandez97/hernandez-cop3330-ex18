/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initializing change and the String "to" to avoid repeating output strings
        int change = 0;
        String to = " ";
        //prompt the user to choose between Celsius or Fahrenheit
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String choice = in.nextLine();
        //now depending on their answer, ask the user to put in the temperature in either F or C
        if(choice.equals("F") || choice.equals("f")) {
            //change the to String to Fahrenheit to indicate what temperature scale it is being changed to
            to = "Fahrenheit";
            System.out.print("Please enter the temperature in Celsius: ");
            int c = in.nextInt();
            change = (c * 9 / 5) + 32;
        }
        else if(choice.equals("C") || choice.equals("c")) {
            //same thing for Celsius as with Fahrenheit
            to = "Celsius";
            System.out.print("Please enter the temperature in Fahrenheit: ");
            int f = in.nextInt();
            change = (f - 32) * 5 / 9;
        }
        //output the results
        System.out.printf("The temperature in %s is %d.", to, change);
    }
}
