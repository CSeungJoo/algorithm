package deepening1;

import java.util.Scanner;
public class _2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() * 2 - 1;
        sc.close();
        int i = 1;
            for (int j = 1; j <= n; j += 2) {
                for (int k = (n / 2) - i; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                }
//                for (int k = (n / 2) - i; k >= 0; k--) {
//                    System.out.print(" ");
//                }
                i++;
            System.out.println();
            }
            i = (n + 1) / 2 - 2;
        for (int j = n ; j > 1; j-= 2) {
            for (int k = 0; k < (n / 2) - i; k++) {
                System.out.print(" ");
            }
            for (int k = j - 2; k > 0; k--) {
                System.out.print("*");
            }
//            for (int k = 0; k < (n / 2) - i; k++) {
//                System.out.print(" ");
//            }
            i--;
            System.out.println();
        }
        }
}
