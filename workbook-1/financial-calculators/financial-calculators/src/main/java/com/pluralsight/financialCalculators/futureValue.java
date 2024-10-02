package com.pluralsight.financialCalculators;

import java.text.NumberFormat;
import java.util.Scanner;

public class futureValue {

    public void showMessage() {
        System.out.println("You have selected The Future Value Calculator ");
    }

    public void calcuFutureValue (){




        Scanner CDScanner = new Scanner(System.in);

        //Daily Compounding
        double compoundedRTimes = 365;

        //Inputs the Initial Deposit amount, Annual Interest Rate and the number of years

        System.out.println("Welcome, please enter the initial deposit amount: ");
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
        String futureValueFinal = NumberFormat.getCurrencyInstance().format(futureValue);

        //Calculate the total interest earned
        double totalInterest = futureValue - principal;
        String totalInterestFinal = NumberFormat.getCurrencyInstance().format(totalInterest);

        //Display
        System.out.println("The future value  is: "+ futureValueFinal);

        System.out.println("Total Interest earned: " + totalInterestFinal);


    }


}
