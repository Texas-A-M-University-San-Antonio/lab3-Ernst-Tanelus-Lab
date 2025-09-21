/**
 * Name: [Ernst Tanelus]
 * Date: [09/10/2025]
 * Purpose: Lab3_Ernst_Tanelus -
 * This program models the appreciation of a home's value over time by calculating compound interest on its initial value.
 * This program emphasizes: numeric data handling, user interaction, and the use of Java's Math.pow() for exponentiation.
 * It reflects foundational concepts in finicial mathematics, particularly the discrete compounding of asset values.
 */

 import java.util.Scanner;//import the Scanner class for robust user input handling. 
 public class Lab3_Ernst_Tanelus
 {
    public static void main(String[] args)
    {
        // Instantiate the Scanner to capture input from the user (keyboard).
        Scanner input = new Scanner(System.in);

        //Variable declarations:
        double initialValue; //The orgina price of the property (principal, P)
        int years; // The number of elapsed years (time, t)
        double interestRate; // The nominal annual interest rate (as a percentage, to be converted).
        double finalValue; //The computed future value of the property (A).

        //Prompt user to the initial value of the home and assign input
        System.out.print("Please enter the intial value of the home: ");
        initialValue = input.nextDouble();

        //Prompt user to the number of elapsed years and assign input
        System.out.print("Please enter the number of elapsed years: ");
        years = input.nextInt();

        //Prompt user for the annual interest rate (as a percentage) and assign input.
        System.out.print("Please enter the interest rate: ");
        interestRate = input.nextDouble();

        //Convert the interest rate from a percentage to a decimal (e.g., 6% becomes 0.06).
        interestRate = interestRate / 100.0; 

        //Compute the final value of the home using the compound interest formula:
        // A = P * (1 + r)^t
        // This encapsulates exponential growth, where (1 + r) is the growth factor per period.
        finalValue = initialValue * Math.pow((1 + interestRate), years); 

        //Display the computed final value to the user, formatted to two decimal places for clarity.
        System.out.printf("The final value of the home is: %.2f%n", finalValue);

        // Interdisciplinary commentary:
        // This comutational model is foundational in economics and finance, and relates closely to exponential functions in mathematics,
        // as well as discete-time dynamical sustems in sustems theory. The abstraction of compound interest has applications
        //across actuarial science, real estate investment, and macroeconomic growth models.


    }
 }
