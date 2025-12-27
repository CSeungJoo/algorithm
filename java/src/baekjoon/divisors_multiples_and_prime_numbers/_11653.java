package baekjoon.divisors_multiples_and_prime_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i < basePrime.length; i++) {
            if (!basePrime[i]) {
                continue;
            }

            if (i * i > n) {
                break;
            }

            while(n % i == 0) {
                factors.add(i);
                n = Math.floorDiv(n, i);
            }
        }
        if (n > 1) {
            factors.add(n);
        }

        for (Integer factor : factors) {
            System.out.println(factor);
        }
    }
}
