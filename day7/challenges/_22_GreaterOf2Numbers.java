package day7.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _22_GreaterOf2Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> dynamicMap = new HashMap<>();
        for (int i = 1; i <= 2; i++) {
            System.out.println("enter number " + i + " : ");

            dynamicMap.put("num" + i, input.nextInt());
        }

        System.out.println(dynamicMap.get(dynamicMap.keySet().toArray()[0]));
        System.out.println(dynamicMap.get(dynamicMap.keySet().toArray()[1]));

    }
}
