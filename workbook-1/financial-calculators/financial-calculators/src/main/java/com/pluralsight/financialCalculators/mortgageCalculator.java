package com.pluralsight.financialCalculators;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {

    public static void main(String[] args) {


        //Initiate the scanner
        Scanner mortgageScanner = new Scanner(System.in);


        //Welcome to the calculator
        System.out.println("Welcome to the Mortgage Calculator");
        mortgageScanner.nextLine();

        //Input the principal
        System.out.println("Please enter  the amount of your loan: ");
        double principal = mortgageScanner.nextDouble();
        mortgageScanner.nextLine();

        //Input the annual interest rate and converted from percentages to decimals, and converting the annual interest in monthly interest rate
        System.out.println("Enter the Interest Rate: ");
        double interestRate = mortgageScanner.nextDouble();
        mortgageScanner.nextLine();
        interestRate = interestRate / 100 / 12;
        double aRate = (1 + interestRate);

        //Input the loan term in years and converted in months term
        System.out.println("Enter your Loan Term (In years): ");
        int loanTermPmonth = mortgageScanner.nextInt();
        mortgageScanner.nextLine();
        loanTermPmonth = loanTermPmonth * 12;


        //Where the math occurs
        double mortgage = (principal * interestRate * Math.pow(aRate, loanTermPmonth)) / (Math.pow(aRate, loanTermPmonth) - 1);

        //Use the NumberFormat class to calculated
        String mortgageFinal = NumberFormat.getCurrencyInstance().format(mortgage);

        //Total payment over loan term
        double totalPayment= mortgage* loanTermPmonth;

        double totalInterestPaid= totalPayment-principal;
        String totalInterestPaidFinal = NumberFormat.getCurrencyInstance().format(totalInterestPaid);

        //Print the mortgage
        System.out.println("Mortgage = " + mortgageFinal);
        System.out.println("Total interest pay = " + totalInterestPaidFinal);


    }


}
