// create a program that takes 2 numbers and shows results of all arithmetic operators

package day1.challenges;

import java.util.Scanner;

public class _1_arithmeticOperators {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter 1st number");
            int num1 = input.nextInt();
            System.out.println("enter 2nd number");
            int num2 = input.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }
    }
}