package one_dimensional_array;
import java.util.Arrays;
import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        System.out.println(Arrays.stream(arr).distinct().toArray().length);
    }
}
