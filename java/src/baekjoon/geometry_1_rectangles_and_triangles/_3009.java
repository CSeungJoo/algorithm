package baekjoon.geometry_1_rectangles_and_triangles;

import java.util.Scanner;

public class _3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] coordinate = new int[3][2]; // (x, y) 형태
        for (int i = 0; i < 3; i++) {
            coordinate[i][0] = sc.nextInt();
            coordinate[i][1] = sc.nextInt();
        }
        sc.close();

        int xPredictedCoordinates = 0;
        int yPredictedCoordinates = 0;

        for (int i = 0; i < 3; i++) {
            xPredictedCoordinates ^= coordinate[i][0];
            yPredictedCoordinates ^= coordinate[i][1];
        }

        System.out.println(xPredictedCoordinates +" "+ yPredictedCoordinates);
    }
}
