package day2.challenges;

import java.util.Scanner;

public class _8_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number whose table you want to print : ");
        int tableToPrint = input.nextInt();
        tablePrint(tableToPrint);
    }

    public static void tablePrint(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
