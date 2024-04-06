package day3.challenges;

import java.util.Scanner;

public class _15_ArmstrongNumber {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter number you want to check : ");
            int num = input.nextInt();
            int numCopy = num;
            int sumOfDigitsWithPower = 0;

            int digits = 0;

            while (numCopy > 0) {
                digits += 1;
                numCopy /= 10;
            }

            numCopy = num;

            for (int i = 0; i < digits; i++) {
                int lastDigit = numCopy % 10;
                sumOfDigitsWithPower += Math.pow(lastDigit, digits);
                numCopy /= 10;
            }

            if (num == sumOfDigitsWithPower) {
                System.out.println(num + " is an armstrong number");
            } else {
                System.out.println(num + " is not an armstrong number");
            }

        } catch (Exception e) {
            System.out.println("invalid input");
        }

    }
}
