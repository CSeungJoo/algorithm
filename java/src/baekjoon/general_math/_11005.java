package baekjoon.general_math;

import java.util.Scanner;

public class _11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        System.out.println(tenToB(N, B));
    }

    public static String tenToB(int N, int B) {
        StringBuilder sb = new StringBuilder();

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                sb.append(remainder);
            } else {
                sb.append((char) ('A' + (remainder - 10)));
            }
            N /= B;
        }

        return sb.reverse().toString();
    }
}