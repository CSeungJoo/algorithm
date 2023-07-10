package deepening1;

import java.util.*;

public class _1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        sc.close();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }
        int max = 0;
        char result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char)(i + 'A');
            }else if(arr[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}