package com.pluralsight.financialCalculators;

import java.util.Scanner;

public class futureValue {

    public static void main(String[] args) {
        Scanner CDScanner = new Scanner(System.in);

        //Daily Compounding
        double compoundedRTimes = 365;

        //Inputs the Initial Deposit amount, Annual Interest Rate and the number of years

        System.out.println("Enter the initial deposit amount: ");
        double principal = CDScanner.nextDouble();
        CDScanner.nextLine();

        System.out.println("Enter the interest rate: ");
        double interestRate = CDScanner.nextDouble();
        CDScanner.nextLine();
        double dailyInterestRate = interestRate / 100 / compoundedRTimes;

        System.out.println("Enter the number of years: ");
        int years = CDScanner.nextInt();
        CDScanner.nextLine();

        //Calculate compounding periods
        double daysCompounding = years * compoundedRTimes;

        //Calculate the future value
        double futureValue = principal * Math.pow(1 + dailyInterestRate, daysCompounding);

        //Calculate the total interest earned
        double totalInterest = futureValue - principal;

        //Display
        System.out.printf("The future value after %d years is: $%.2f%n", years, futureValue);

        System.out.printf("Total Interest earned: $%.2f%n", totalInterest);


    }


}
