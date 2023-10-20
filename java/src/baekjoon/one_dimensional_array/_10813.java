package baekjoon.one_dimensional_array;
import java.util.Scanner;
public class _10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            int j, k;
            j = sc.nextInt() - 1;
            k = sc.nextInt() - 1;
            int l = arr[k];
            arr[k] = arr[j];
            arr[j] = l;
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
