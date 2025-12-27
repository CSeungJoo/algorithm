package baekjoon.divisors_multiples_and_prime_numbers;

import java.util.Scanner;

public class _2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
// 1 2 3 4 6 12