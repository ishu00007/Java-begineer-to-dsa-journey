package day1;

public class _2_variables {
    public static void main(String[] args) {

        // primitive data types

        /*
         * 
         * here all varialbe names are called as identifiers
         * 
         * identifiers rules =>
         * 
         * alphanumberic , _ o, $ is allowed in their names
         * must not start with an integer
         * can't use reserver words or keywords
         * 
         * dataType identifier = literla
         * int a = 2
         * 
         * int => dataType
         * a => identifier
         * 2 => literal
         * 
         */

        byte a = 23; // -128 to 127
        short b = 190; // -32,768 to 32,767
        int c = 1000; // -2,147,483,648 to 2,147,483,647
        long d = 30000; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float e = 3.3f; // Approximately ±1.4 × 10^-45 to ±3.4 × 10^38, with a precision of about 7
                        // decimal digits.
        double f = 56789.32423d; // Approximately ±4.9 × 10^-324 to ±1.8 × 10^308, with a precision of about 15
                                 // decimal digits.
        char g = 'A'; // '\u0000' (0) to '\uffff' (65,535)
        boolean h = true;

        System.out.println("byte => " + a);
        System.out.println("short => " + b);
        System.out.println("int => " + c);
        System.out.println("long => " + d);
        System.out.println("float => " + e);
        System.out.println("double => " + f);
        System.out.println("char => " + g);
        System.out.println("boolean => " + h);
    }

    // naming conventions

    // camelCase => myVarialbeName
    // snake_case => my_variable_name
    // kebab-case => my-varialbe-name
}
