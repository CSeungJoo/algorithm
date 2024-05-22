package baekjoon.dynamicProgramming;

import java.util.*;

public class _24416 {
    static Map<Integer, Integer> list = new HashMap<>();
    static int count = 0;
    public static int fibonacci(int n) {
        if (list.get(n) != null) {
            return list.get(n);
        }
        list.put(n, fibonacci(n - 1) + fibonacci(n - 2));
        count++;
        return list.get(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        list.put(1, 1);
        list.put(2, 1);
        System.out.println(fibonacci(n) +" "+ count);
    }
}
