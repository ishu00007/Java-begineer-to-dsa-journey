package day3;

import java.util.Scanner;

public class _9_array {
    public static void main(String[] args) {
        try (// int[] numbers = new int[3];
                Scanner input = new Scanner(System.in)) {
            System.out.println("enter number you want to add with space in between them");
            String numbersToAdd = input.nextLine();

            String[] numbersString = numbersToAdd.split("\\s+");
            int[] numbersArr = new int[numbersString.length];

            // int[] numbers = { 1, 3, 5 };
            for (int i = 0; i < numbersString.length; i++) {
                numbersArr[i] = Integer.parseInt(numbersString[i]);
            }

            System.out.println(sumOfArrayElements(numbersArr));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }

    public static int sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
