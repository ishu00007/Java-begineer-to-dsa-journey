package day2.challenges;

import java.util.Scanner;

public class _12_primeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number you want to check : ");
        int num = input.nextInt();
        boolean prime = true;

        for (int i = 2; i < num; i++) {
            // System.out.println("2");
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime);
    }
}
