package baekjoon.String;

import java.util.Scanner;
public class _2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String p = sc.next();
            for (int j = 0; j < p.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(p.charAt(j));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
