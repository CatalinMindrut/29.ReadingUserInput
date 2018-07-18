package com.Catalin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /** System.out dumps text to the console.
         *  System.in is the opposite, it allows you to type input into the console
         *  which then gets returned back to the program.
         *  The "new" keyword is used to create a new instance of the Scanner or a new object
         *  of type Scanner.
         */

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        /** The hasNextInt method is being used to avoid console errors. This will check that the next input is
         * an integer, returning false if it is not, instead of returning an error.
         */

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)
            /** A problem with nextInt is that pressing enter will actually skip the next input.
             * This means that the user never gets the chance to enter his name.
             * To fix this you just need to add another nextLine statement without assigning any variable.
             */

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            /** We're using the variable scanner defined earlier and we're calling the method
             * nextLine to read a line of input from the console.
             */
            int age = 2018 - yearOfBirth;

            if(age >=0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
            /** The if statement handles the case where the user enters an invalid year.
             */
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
        /** Close method is used to close te scanner after we are done using it. This will release
         * the memory used by the scanner.
         */
    }
}
