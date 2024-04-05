package day2.challenges;

import java.util.Scanner;

public class _5_positiveOrnegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any digit");
        int digit = input.nextInt();

        if (digit > 0) {
            System.out.println("it is +ve");
        } else if (digit < 0) {
            System.out.println("it is -ve");
        } else {
            System.out.println("it is 0");
        }
    }
}
