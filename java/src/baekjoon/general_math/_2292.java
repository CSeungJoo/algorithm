package baekjoon.general_math;

import java.util.Scanner;

public class _2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N == 1) {
            System.out.println(1);
            return;
        }
        int cnt = 1;
        int calc = 1;
        while(N >= calc) {
            calc += cnt * 6;
            cnt++;
        }
        System.out.println(cnt);
    }
}
