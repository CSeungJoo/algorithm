package baekjoon.geometry_1_rectangles_and_triangles;

import java.util.Scanner;

public class _1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        sc.close();

        int calcX = w - x;
        int calcY = h - y;

        int min = Math.min(Math.min(x, calcX), Math.min(y, calcY));

        System.out.println(min);
    }
}
