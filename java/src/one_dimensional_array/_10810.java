package one_dimensional_array;
import java.util.Scanner;
public class _10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int j, k, l;
            j = sc.nextInt();
            k = sc.nextInt();
            l = sc.nextInt();
            j -= 1;
            k -= 1;
            do {
                arr[j] = l;
                j++;
            }while(j <= k);
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
