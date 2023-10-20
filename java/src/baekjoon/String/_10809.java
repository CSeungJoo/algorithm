package baekjoon.String;

import java.util.Scanner;
public class _10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        for (int i = 0; i < 26; i++) {
            int result = -1;
            for (int j = 0; j < s.length(); j++) {
                if(arr[j] == (char)(97 + i)) {
                    result = j;
                    break;
                }
            }
            System.out.print(result +" ");
        }
    }
}
