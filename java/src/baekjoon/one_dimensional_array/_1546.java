package baekjoon.one_dimensional_array;
import java.util.Scanner;
public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        double avg = 0;
        for (int i = 0; i < n; i++) {
            avg += (double)arr[i] / (double)max * 100;
        }
        System.out.println(avg / n);
    }
}
