package day7.challenges;

import java.util.Scanner;

public class _25_sumOfInputNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int inputNum;

        do {
            System.out.print("enter number to add : ");
            inputNum = input.nextInt();

            if (inputNum > 0) {
                sum = sum + inputNum;
            }

            System.out.println(sum);
        } while (sum > 0);

        System.out.println("sum of all numbers = " + sum);

    }
}
