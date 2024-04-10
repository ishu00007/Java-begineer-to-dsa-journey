package day7.challenges;

import java.util.Scanner;

public class _26_fibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number till which to print fibonacci series : ");
        int num = input.nextInt();
        System.out.println(fibonacci(num));

    }

    public static int fibonacci(int n) {
        // Base cases: if n is 0 or 1, Fibonacci number is n
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            // Recursive case: Fibonacci number is sum of previous two Fibonacci numbers
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
