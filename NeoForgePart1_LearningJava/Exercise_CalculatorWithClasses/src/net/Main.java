package net;

/* EXERCISE 3a: Calculator with Classes (Possibly Over-Engineered)
 *  Refactor the Calculator to use Classes. Make an Interface class called Operation and then
 *  implement that interface for each math operation that's available.
 *
 *  Estimated Time: 60-90 minutes
 */

import net.wady.*;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner reader = new Scanner(System.in);

        char operationChar = ' ';

        System.out.println("Enter Operation Of Choice:");
        System.out.println("\"ADD\", \"SUB\", \"MULT\", or \"DIV\"");
        String operation = reader.nextLine().toUpperCase();
        System.out.println("Enter first number:");
        String input1 = reader.nextLine();
        System.out.println("Enter second number:");
        String input2 = reader.nextLine();

        int result;

        switch (operation) {
            case "ADD", "+":
                Addition addition = new Addition();
                result = addition.operation(input1, input2);
                operationChar = addition.getOperationSymbol();
                break;
            case "SUB", "-":
                Subtraction subtraction = new Subtraction();
                result = subtraction.operation(input1, input2);
                operationChar = subtraction.getOperationSymbol();
                break;
            case "MULT", "*", "X":
                Multiplication multiplication = new Multiplication();
                result = multiplication.operation(input1, input2);
                operationChar = multiplication.getOperationSymbol();
                break;
            case "DIV", "/":
                Division division = new Division();
                result = division.operation(input1, input2);
                division.reportRemainder();
                operationChar = division.getOperationSymbol();
                break;
            default:
                System.out.println("Please enter a valid operation.");
                result = 0;
                break;
        }

        System.out.println(input1 + " " + operationChar + " " + input2 + " = " + result);


    }

}
