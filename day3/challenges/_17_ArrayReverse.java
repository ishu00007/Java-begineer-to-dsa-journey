package day3.challenges;

import java.util.Scanner;

public class _17_ArrayReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter elements of array with space between each element : ");
        String arrElements = input.nextLine();

        Object[] arr = arrElements.split("\\s+");
        Object[] reversedArr = new Object[arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArr[index] = arr[i];
            index++;
        }

        for (Object element : reversedArr) {
            System.out.print(element + " ");
        }
    }
}
