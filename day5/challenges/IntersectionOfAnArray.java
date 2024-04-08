package day5.challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfAnArray {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter integers of first array:");
            String numbersString = input.nextLine();
            String[] numbersStringArr = numbersString.split("\\s+");
            int[] numbersArr = new int[numbersStringArr.length];
            Set<Integer> uniqueNumbersSet = new HashSet<>();

            for (int i = 0; i < numbersStringArr.length; i++) {
                numbersArr[i] = Integer.parseInt(numbersStringArr[i]);
                uniqueNumbersSet.add(numbersArr[i]);
            }

            System.out.println("Enter integers of second array:");
            String numbersString2 = input.nextLine();
            String[] numbersStringArr2 = numbersString2.split("\\s+");
            int[] numbersArr2 = new int[numbersStringArr2.length];

            for (int i = 0; i < numbersStringArr2.length; i++) {
                numbersArr2[i] = Integer.parseInt(numbersStringArr2[i]);
            }

            System.out.println("Intersection of the two arrays:");

            Set<Integer> intersectionSet = new HashSet<>();
            for (int number : numbersArr2) {
                if (uniqueNumbersSet.contains(number)) {
                    intersectionSet.add(number);
                }
            }

            if (intersectionSet.isEmpty()) {
                System.out.println("There is no intersection in these two arrays.");
            } else {
                for (int num : intersectionSet) {
                    System.out.print(num + " ");
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integers only.");
        }
    }
}
