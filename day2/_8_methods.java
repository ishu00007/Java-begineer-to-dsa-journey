package day2;

public class _8_methods {
    public static void main(String[] args) {
        System.out.println(addition(190, 5));
        System.out.println(substract(3, 5));
    }

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int substract(int a, int b) {
        int difference = a - b;
        return difference;
    }
}
