package day4.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class _19_ArraySort {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("enter numbers that you want to sort with space between them ");
            String numbers = input.nextLine();
            String[] numbersStringArr = numbers.split("\\s+");
            int[] numbersArr = new int[numbersStringArr.length];

            for (int i = 0; i < numbersStringArr.length; i++) {
                numbersArr[i] = Integer.parseInt(numbersStringArr[i]);

            }

            Arrays.sort(numbersArr);

            for (int num : numbersArr) {
                System.out.print(num + " ");
            }

        } catch (Exception e) {
            System.out.println("invalid input");
        }
    }

}
