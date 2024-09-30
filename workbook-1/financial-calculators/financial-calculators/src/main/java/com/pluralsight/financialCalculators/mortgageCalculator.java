package com.pluralsight.financialCalculators;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {

    public static void main(String[] args) {


        //Initiate the scanner
        Scanner mortgageScanner = new Scanner(System.in);


        //Input the principal
        System.out.println("Enter your Home Price: ");
        double principal = mortgageScanner.nextDouble();
        mortgageScanner.nextLine();

        //Input the interest rate and converted percentages to decimals
        System.out.println("Enter the Interest Rate: ");
        double interestRate = mortgageScanner.nextDouble();
        mortgageScanner.nextLine();
        interestRate = interestRate / 100 / 12;
        double aRate = (1 + interestRate);

        //Input the term and converted
        System.out.println("Enter your Loan Term (In years): ");
        int loanTermPyear = mortgageScanner.nextInt();
        mortgageScanner.nextLine();
        loanTermPyear = loanTermPyear * 12;


        //Where the math occurs
        double mortgage = (principal * interestRate * Math.pow(aRate, loanTermPyear)) / (Math.pow(aRate, loanTermPyear) - 1);
        String mortgageFinal = NumberFormat.getCurrencyInstance().format(mortgage);

        //Print the mortgage
        System.out.println("Mortgage = " + mortgageFinal);


    }


}
