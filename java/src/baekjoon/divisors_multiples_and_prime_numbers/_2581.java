package baekjoon.divisors_multiples_and_prime_numbers;

import java.util.*;

public class _2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int limit = (int) Math.sqrt(n);
        boolean[] basePrime = new boolean[limit + 1];
        Arrays.fill(basePrime, true);
        basePrime[0] = basePrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (basePrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    basePrime[j] = false;
                }
            }
        }

        boolean[] isPrime = new boolean[n - m + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= limit; i++) {
            if (!basePrime[i]) continue;

            int start = Math.max(i * i, ((m + i - 1) / i) * i);
            for (int j = start; j <= n; j += i) {
                isPrime[j - m] = false;
            }
        }

        int sum = 0;
        int min = -1;
        for (int i = 0; i <= n - m; i++) {
            int num = i + m;
            if (num >= 2 && isPrime[i]) {
                sum += num;
                if (min == -1) min = num;
            }
        }

        if (min == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}