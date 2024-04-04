package day1;

import java.util.Scanner;

public class _3_userInput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter your name");
            String name = input.nextLine();

            System.out.println(name + " enter your age");

            byte age = input.nextByte();

            if (age < 18 && age > 0) {
                System.out.println(name + " m 18 se niche walo ko serious nhi leta :)");
            } else if (age > 120) {
                System.out.println(name + " swarg se input de rha h kya lasan :)");
            } else if (age >= 0 && age < 18) {
                System.out.println(name + " bacche phle complain pike bda hoja :)");
            } else if (age < 0) {
                System.out.println(name + " ky :)");
            } else {
                System.out.println(name + age + " years old welcome :}");
            }
        }
    }
}