package baekjoon.two_dimensional_array;

import java.util.Scanner;
public class _2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[][] arr = new boolean[100][100];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a;  j < a + 10; j++) {
                for (int k = 90 - b; k <100 - b; k++) {
                    arr[j][k] = true;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(arr[i][j]) sum++;
            }
        }
        System.out.println(sum);
    }
}
