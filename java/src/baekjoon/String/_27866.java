package baekjoon.String;
import java.util.Scanner;
public class _27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = sc.nextInt() - 1;
        sc.close();

        System.out.println(s.charAt(i));
    }
}
