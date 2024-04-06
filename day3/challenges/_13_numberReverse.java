package day3.challenges;

import java.util.Scanner;

public class _13_numberReverse {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {

            System.out.print("enter number : ");
            int num = input.nextInt();
            String reversedNumber = "";

            while (num > 0) {
                int lastDigit = num % 10;
                reversedNumber = (reversedNumber + lastDigit);
                num /= 10;

            }

            System.out.println(reversedNumber);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
