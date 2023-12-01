package baekjoon.two_dimensional_array;

import java.util.Scanner;

public class _2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0, row = 0, col = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int value = sc.nextInt();;
                if (value >= max) {
                    max = value;
                    row = j + 1;
                    col = i + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(col +" "+ row);
    }
}
