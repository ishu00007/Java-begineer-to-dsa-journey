package day3.challenges;

import java.util.Scanner;

public class _16_largestElementInArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in);) {

            System.out.print("enter numbers with space in between whose avg you want to find : ");

            String numberString = input.nextLine();
            String[] StringNumbers = numberString.split("\\s+");

            int[] numbers = new int[StringNumbers.length];

            int largestNum = 0;

            for (int i = 0; i < StringNumbers.length; i++) {
                numbers[i] = Integer.parseInt(StringNumbers[i]);
                if (numbers[i] > largestNum) {
                    largestNum = numbers[i];
                }
            }

            System.out.println("largest number is : " + largestNum);
        } catch (Exception e) {
            System.out.println("invalid input");
        }

    }
}