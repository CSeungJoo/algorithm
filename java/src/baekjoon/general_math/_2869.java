package baekjoon.general_math;

import java.util.Scanner;

public class _2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(), B = sc.nextInt(), V = sc.nextInt();

        double v = V - A;
        double b = A - B;

        System.out.println((int)Math.ceil(v / b) + 1);
    }
}

