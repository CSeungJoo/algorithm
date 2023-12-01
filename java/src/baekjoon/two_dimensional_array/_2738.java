package baekjoon.two_dimensional_array;


import java.util.Scanner;

public class _2738 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] sum = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
                sum[i][j] = b[i][j] + a[i][j];
            }
        }
        for (int[] ints : sum) {
            for (int anInt : ints) {
                System.out.print(anInt +" ");
            }
            System.out.println();
        }
    }
}
