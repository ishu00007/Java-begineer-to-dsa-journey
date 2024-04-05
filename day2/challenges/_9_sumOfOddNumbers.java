package day2.challenges;

import java.util.Scanner;

public class _9_sumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number till which you want sum of all odd numbers : ");
        int finalNumber = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= finalNumber; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
