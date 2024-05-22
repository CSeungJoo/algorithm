package baekjoon.dynamicProgramming;

import java.util.Scanner;

public class _9461 {
    static long[] memo = new long[101];

    static long solution(int n) {
        if (n <= 3)
            return 1;

        if (memo[n] != 0)
            return memo[n];

        memo[n] = solution(n - 2) + solution(n - 3);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long[] N = new long[T];
        for (int i = 0; i < T; i++) {
            N[i] = solution(sc.nextInt());
        }
        sc.close();
        for (long i : N) {
            System.out.println(i);
        }
    }
}
