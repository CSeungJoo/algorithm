package String;

import java.util.Scanner;
public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String input = sc.next();
        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(input.charAt(i));
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(sum);
    }
}
