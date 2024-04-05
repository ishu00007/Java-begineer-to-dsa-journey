package day2.challenges;

import java.util.Scanner;

public class _7_greatestOfnNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1 = input.nextInt();
        System.out.println("enter 2nd number");
        int num2 = input.nextInt();
        System.out.println("enter 3rd number");
        int num3 = input.nextInt();

        int greatest = num1;

        if (greatest < num2) {
            greatest = num2;
        }
        if (greatest < num3) {
            greatest = num3;
        }

        System.out.println("greatest number is " + greatest);

    }
}
