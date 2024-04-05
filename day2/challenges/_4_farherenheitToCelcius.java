package day2.challenges;

import java.util.Scanner;

public class _4_farherenheitToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 for degreee f to degree c \nenter 2 for degree c to degree f");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("enter degree f");
            double fahrenheit = input.nextDouble();
            System.out.println(((fahrenheit - 32) * 5) / 9);
        } else if (choice == 2) {
            System.out.println("enter degree c");
            double celcius = input.nextDouble();
            System.out.println(((celcius * 9) / 5) + 32);
        } else {
            System.out.println("enter valid number :(");
        }
    }
}