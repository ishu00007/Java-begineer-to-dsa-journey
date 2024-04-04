// take input from user and find area of triangle

package day1.challenges;

import java.util.Scanner;

public class _3_areaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter breadth of triangle");
        int breadth = input.nextInt();
        System.out.println("enter length of triangle");
        int length = input.nextInt();
        System.out.println("area of triangle => " + ((length * breadth) / 2));
    }
}
