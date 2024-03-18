package baekjoon.general_math;

import java.util.Scanner;

public class _2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < T; i++) {
            System.out.print(arr[i] / 25 + " ");
            arr[i] = arr[i] % 25;

            System.out.print(arr[i] / 10 + " ");
            arr[i] = arr[i] % 10;

            System.out.print(arr[i] / 5 + " ");
            arr[i] = arr[i] % 5;

            System.out.println(arr[i] / 1);
            arr[i] = arr[i] % 1;
        }
    }
}
