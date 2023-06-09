package String;
import java.util.Scanner;
public class _2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int a = 0, b = 0;
        int[] save = new int[3];
        for (int i = 0; i < 3; i++) {
            save[i] = arr[0].charAt(i);
        }
        int[] intArr = {1, 10, 100};
        for (int i = 2; i >= 0; i--) {
            a += (save[i] - 48) * intArr[i];
        }
        for (int i = 0; i < 3; i++) {
            save[i] = arr[1].charAt(i);
        }
        for (int i = 2; i >= 0; i--) {
            b += (save[i] - 48) * intArr[i];
        }
        if(a > b) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
