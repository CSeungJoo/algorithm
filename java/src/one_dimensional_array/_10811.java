package one_dimensional_array;
import java.util.Scanner;
public class _10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int j, k;
            j = sc.nextInt() - 1;
            k = sc.nextInt() - 1;
            while(j < k) {
                int temp = arr[j];
                arr[j++] = arr[k];
                arr[k--] = temp;
            }
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
//2 1 4 3 5