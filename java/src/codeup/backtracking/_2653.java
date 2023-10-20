package codeup.backtracking;

import java.util.Scanner;

public class _2653 {
    static int max;
    static int cnt = 0;
    static int[] arr;

    static void backTracking(int i) {
        if(i == 0) {
            cnt += 1;
            return;
        }
        else {
            arr[i] = 1;
            backTracking( i - 1);
            arr[i] = 0;
            if(i == max) backTracking(i - 1);
            else if(check(i)) backTracking(i - 1);
        }
    }
    static Boolean check(int i) {
        if(arr[i] == 0 && arr[i + 1] == 0) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        max = n;
        _2653.arr = arr;

        backTracking(n);
        System.out.println(cnt);
    }
}
