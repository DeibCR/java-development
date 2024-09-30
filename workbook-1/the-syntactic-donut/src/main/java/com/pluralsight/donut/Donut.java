package com.pluralsight.donut;


// We LOVE our delimiters!!!!

/*

*{} curly braces
    surround:
    Method body
    Class declaration
    Array Initializer
*[] square braces
    Array declarations
    Array Access
*<> pointy braces:
    Template parameter list
*() parentheses:
    Parameter list for method
*;  semicolon:
    Ends of statements
=: assignment operator
 */


import java.util.Scanner;

public class Donut {
    static double price = .25;

    static double getTotalPrice(int numberOfDonuts) {
        return price * numberOfDonuts;
    }

    public static void main(String[] args) {

        //Get a scanner to read input from System.in
        Scanner inputScanner = new Scanner(System.in);

        // Read the input number
        System.out.println("Welcome!, How many donuts do you want?: ");
        int numberOfDonuts = inputScanner.nextInt();
        inputScanner.nextLine();

        System.out.println("Your donuts cost:");

        double totalPrice= getTotalPrice(numberOfDonuts);

        System.out.println(totalPrice + " dollars");

        System.out.printf("In dollars, that would be $%4.2f\n", totalPrice);

        System.out.printf("The square root of 5 is %8.15f\n", Math.sqrt(5.0));
    }


}
