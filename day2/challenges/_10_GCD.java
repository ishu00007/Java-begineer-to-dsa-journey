package day2.challenges;

import java.util.Scanner;

public class _10_GCD {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter 1st number");

        int num1 = input.nextInt();

        System.out.println("enter 2nd number");

        int num2 = input.nextInt();

        int greater = num1 > num2 ? num1 : num2;

        int GCD = 0;

        for (int i = 1; i <= greater; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
            }
        }

        System.out.println(GCD);

    }
}
