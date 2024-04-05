package day2;

import java.util.Scanner;

public class _6_relationalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1 = input.nextInt();
        System.out.println("enter 2nd number");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is smaller than " + num2);

        } else {
            System.out.println("both are equal :)");
        }

    }
}
