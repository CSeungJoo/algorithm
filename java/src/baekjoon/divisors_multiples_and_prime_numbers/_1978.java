package baekjoon.divisors_multiples_and_prime_numbers;

import java.util.Scanner;

public class _1978 {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();

            boolean prime = isPrime(M);

            if (prime) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
