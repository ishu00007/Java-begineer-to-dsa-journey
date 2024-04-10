package day7.challenges;

import java.util.Scanner;

public class _23_passwordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a new password : ");
        String password = input.nextLine();
        String InputPassword;
        do {
            System.out.print("enter your password : ");
            InputPassword = input.nextLine();
        } while (!InputPassword.equals(password));

        if (InputPassword.equals(password)) {
            System.out.println("correct password mate!");
        }
    }
}
