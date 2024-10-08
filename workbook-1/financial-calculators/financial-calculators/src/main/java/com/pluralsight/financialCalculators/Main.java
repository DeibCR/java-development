package com.pluralsight.financialCalculators;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner principalScanner = new Scanner(System.in);

        //Ask the user which calculator want to use
        System.out.println("*** Welcome to the Financial Calculator Menu ***\n"
                                    +"\n 1. Mortgage Calculator"
                                    +"\n 2. Future Value Calculator"
                                    +"\n 3. Annuity Calculator"
                                    +"\n Please select the Calculator you want to use: (1, 2, or 3)"  );

        int option = principalScanner.nextInt();

        //Switch loop that decide which calculator use in base of user choice and iniciate that calculator class, call  a message method and the calculate method
        switch (option) {
            case 1:
                mortgageCalculator class1 = new mortgageCalculator();
                class1.showMessage(); //confirmation of what calculator you chose
                class1.mortgageCalc(); //Call of the method that  makes the calculation
                break;

            case 2:
                futureValue futureValueCD = new futureValue();
                futureValueCD.showMessage();
                futureValueCD.calcuFutureValue();
                break;


            case 3:
                annuity annuityCalculator = new annuity();
                annuityCalculator.showMessage();
                annuityCalculator.calcAnnuity();
                break;

            default:
                System.out.println("Invalid choice! Please enter 1,2 or 3.");
                break;
        }

        //close the scanner
        principalScanner.close();


    }


}
