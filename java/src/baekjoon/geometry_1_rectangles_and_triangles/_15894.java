package baekjoon.geometry_1_rectangles_and_triangles;

import java.util.Scanner;

public class _15894 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        sc.close();

        // 계단형으로 재배치했을 때
        // 왼쪽 n + 아래 n + 경사면 2n
        System.out.println(n + n +(n * 2));
    }
}
