package day1;

import java.util.Scanner;

public class _4_assignOperator {
    public static void main(String[] args) {

        // swap the numbers in variables

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter 1st number");
            int a = input.nextInt();
            System.out.println("enter 2nd number");
            int b = input.nextInt();

            System.out.println("input number 1 => " + a + "\ninput number 2 => " + b);
            System.out.println("\nafter swapping \n");

            int c = a;
            a = b;
            b = c;

            System.out.println("swapped input number 1 => " + a + "\nswapped input number 2 => " + b);
        }

    }
}
