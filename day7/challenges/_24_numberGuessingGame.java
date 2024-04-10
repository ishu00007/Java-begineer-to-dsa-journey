package day7.challenges;

import java.util.Random;
import java.util.Scanner;

public class _24_numberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(100);
        // System.out.println(randomNum);

        int inputNumber;

        do {
            System.out.print("enter your guess : ");
            inputNumber = input.nextInt();
            if (inputNumber > randomNum) {
                System.out.println("smaller");
            } else if (inputNumber < randomNum) {
                System.out.println("bigger");
            } else {
                System.out.println("correct man!");
            }
        } while (randomNum != inputNumber);

    }
}
