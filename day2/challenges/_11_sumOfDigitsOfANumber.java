package day2.challenges;

import java.util.Scanner;

public class _11_sumOfDigitsOfANumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number whose digit's sum you want : ");
        int number = input.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println(sum);
    }
}
