package com.pluralsight.financialCalculators;

import java.text.NumberFormat;
import java.util.Scanner;

public class annuity {

    public void showMessage() {
        System.out.println("You have selected The Annuity");
    }

    public void calcAnnuity() {


        Scanner ScannerAnnuity = new Scanner(System.in);

        // Get user input for monthly payout, interest rate, and number of years to pay
        System.out.println("Welcome to the Annuity Calculator, please enter the monthly payout: ");
        double monthlyPayout = ScannerAnnuity.nextDouble();
        ScannerAnnuity.nextLine();

        System.out.println("Please enter the annual interest rate (as a decimal e.g., 0.05 for 5%): ");
        double annualInterestRate = ScannerAnnuity.nextDouble();
        ScannerAnnuity.nextLine();
        double monthlyInterestRate = annualInterestRate / 12;

        System.out.println("Please, enter the number of years to pay: ");
        int years = ScannerAnnuity.nextInt();
        ScannerAnnuity.nextLine();
        int totalPayments = years * 12;


        double presentValue = monthlyPayout * (1 - (1 / Math.pow(1 + monthlyInterestRate, totalPayments))) / monthlyInterestRate;
        String presentValueFinal = NumberFormat.getCurrencyInstance().format(presentValue);

        System.out.println("The present Value of your Annuity is  " + presentValueFinal);


    }
}
