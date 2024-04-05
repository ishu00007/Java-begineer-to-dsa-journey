package day2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _7_logicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern uppercasepattern = Pattern.compile("[A-Z]");
        Pattern lowercasepattern = Pattern.compile("[a-z]");
        Pattern digitsPattern = Pattern.compile("[0-9]");

        System.out.println("enter a password");

        String password = input.nextLine();
        Matcher uppercasematcher = uppercasepattern.matcher(password);
        Matcher lowercaseMatcher = lowercasepattern.matcher(password);
        Matcher digitsMatcher = digitsPattern.matcher(password);

        if (password.length() > 8) {
            System.out.println("password length  OK");
        } else {
            System.out.println("password length  BAD");
        }

        if (uppercasematcher.find()) {
            System.out.println("uppercase letter  OK");
        } else {
            System.out.println("uppercase letter BAD");
        }

        if (lowercaseMatcher.find()) {
            System.out.println("lowercase letter  OK");
        } else {
            System.out.println("lowercase letter BAD");
        }

        if (digitsMatcher.find()) {
            System.out.println("digits  OK");
        } else {
            System.out.println("digits  BAD");
        }

        if (password.length() > 8 && uppercasematcher.find() && lowercaseMatcher.find() && digitsMatcher.find()) {
            System.out.println("password is strong!");
        } else {
            System.out.println("password is not strong");
        }

    }
}
