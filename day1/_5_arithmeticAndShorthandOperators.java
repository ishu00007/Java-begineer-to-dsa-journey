package day1;

public class _5_arithmeticAndShorthandOperators {
    public static void main(String[] args) {
        int a = 5;
        a += 5; // if i write this without shorthand then it will look like a = a + 5
        System.out.println(a);

        a -= 4; // it substacts and stores the new value in a
        System.out.println(a);

        a *= 3; // it multiplies and stores new value in a
        System.out.println(a);

        a /= 2; // it divides and stores new value in a
        System.out.println(a);

        a %= 2; // it finds remainder and stores new value in a
        System.out.println(a);
    }
}