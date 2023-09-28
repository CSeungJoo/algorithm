package deepening1;

import java.util.Scanner;

public class _2941 {
    public static void main(String[] args) {
        String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            while (s.contains(strArr[i])) {
                s = s.replaceFirst(strArr[i], " ");
                count += 1;
            }
        }
        s = s.replaceAll(" ", "");
        for (int i = 0; i < s.length(); i++) {
            count += 1;
        }
        System.out.println(count);
    }
}
