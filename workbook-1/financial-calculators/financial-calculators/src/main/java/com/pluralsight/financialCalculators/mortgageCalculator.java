package com.pluralsight.financialCalculators;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {

    public static void main(String[] args) {


        double totalInterest;

        Scanner calculatorScanner = new Scanner(System.in);

        System.out.println("Enter your Home Price: ");
        double principal = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();

        System.out.println("Enter your Interest Rate: ");
        double interestRate = calculatorScanner.nextDouble();
        calculatorScanner.nextLine();
        interestRate = interestRate / 100 / 12;
        double aRate = (1 + interestRate);

        System.out.println("Enter your Loan Term (In years): ");
        int loanTermPyear = calculatorScanner.nextInt();
        calculatorScanner.nextLine();
        loanTermPyear = loanTermPyear * 12;

        double mortgage = (principal * interestRate * Math.pow(aRate, loanTermPyear)) / (Math.pow(aRate, loanTermPyear) - 1);
        String mortgageFinal = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage = " + mortgageFinal);


    }


}
