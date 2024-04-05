package day2.challenges;

import java.util.Scanner;

public class _6_oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("it is an even number");
        } else {
            System.out.println("it is an odd number");
        }
    }
}
