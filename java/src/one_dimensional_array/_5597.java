package one_dimensional_array;
import java.util.Scanner;
public class _5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[32];
        for (int i = 0; i < 28; i++) {
            int j = sc.nextInt();
            arr[j] = 1;
        }
        for (int i = 1; i < 31; i++) {
            if (arr[i] != 1) System.out.println(i);
        }
    }
}
