// claculate parameter of a rectangle or area of a rectange

package day1.challenges;

import java.util.Scanner;

public class _2_rectangleParameter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 for rectangle's parameter \nenter 2 for rectangle's area");
        byte choice = input.nextByte();
        if (choice == 1) {
            System.out.println("enter length of side 1");
            int side = input.nextInt();
            System.out.println("enter length of side 2");
            int side2 = input.nextInt();
            System.out.println("enter length of side 3");
            int side3 = input.nextInt();
            System.out.println("enter length of side 4");
            int side4 = input.nextInt();

            System.out.println("parameter of rectangle is => " + (side + side2 + side3 + side4));
        } else if (choice == 2) {
            System.out.println("enter length of rectangle");
            int length = input.nextInt();
            System.out.println("enter breadth of rectangle");
            int breadth = input.nextInt();
            System.out.println("area of rectangle is => " + (length * breadth));
        } else {
            System.out.println("select valid input");
        }

    }

}
