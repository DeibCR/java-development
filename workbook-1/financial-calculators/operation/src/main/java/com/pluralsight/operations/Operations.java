package com.pluralsight.operations;

import java.util.Scanner;

public class Operations {


    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {


        Scanner operationScanner = new Scanner(System.in);

        //Input 1
        System.out.println("Welcome, Insert the first number: ");
        int numberOne = operationScanner.nextInt();
        operationScanner.nextLine();

        //Input 2
        System.out.println("Insert the second number: ");
        int numberTwo = operationScanner.nextInt();
        operationScanner.nextLine();

        //math operation
        int result = addNumbers(numberOne, numberTwo);

        //Print the result
        System.out.println("The result of your operation is: " + result);


    }
}
