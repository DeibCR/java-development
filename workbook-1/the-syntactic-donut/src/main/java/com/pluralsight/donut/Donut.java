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


public class Donut {
    static double price = .25;

    static double getTotal(int numberOfDonuts) {
        return price * numberOfDonuts;
    }

    public static void main(String[] args) {
        System.out.println("A dozen donuts cost:");
        System.out.println(getTotal(12) + " dollars");
    }


}
