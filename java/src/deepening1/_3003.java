package deepening1;

import java.util.Scanner;
public class _3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            if(i == 0 || i == 1) {
                System.out.print(1 - arr[i]);
            }else if(i >= 2 && i <= 4) {
                System.out.print(2 - arr[i]);
            }else {
                System.out.print(8 - arr[i]);
            }
            System.out.print(" ");
        }
    }
}
