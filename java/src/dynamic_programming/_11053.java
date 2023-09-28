package dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;
public class _11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] memo = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            memo[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    memo[i] = Math.max(memo[i], memo[j] + 1);
                }
            }
        }
        System.out.println(Arrays.stream(memo).max().getAsInt());
    }
}
