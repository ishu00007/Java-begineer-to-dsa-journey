package day3.challenges;

import java.util.Scanner;

public class _14_palindromeNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {

            System.out.print("enter number : ");

            int num = input.nextInt();
            int reversedNum = 0;
            int numCopy = num;
            while (numCopy > 0) {

                int lastDigit = numCopy % 10;
                reversedNum = (reversedNum * 10) + lastDigit;
                numCopy /= 10;
            }

            if (num == reversedNum) {
                System.out.println("it is a palindrome number");
            } else {
                System.out.println("it is not a palindrome number");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
