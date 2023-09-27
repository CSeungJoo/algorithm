package dynamic_programming;

import java.util.Scanner;

public class _1904 {
    static long[] arr = new long[1000001];

    static long ___(long a) {
        if (a == 1) return 1;
        else if (a == 2) return 2;
        else if (arr[(int)a] != 0) return arr[(int)a];
        return arr[(int)a] = (___(a - 1) + ___(a - 2))%15746;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        System.out.println(___(N));
    }
}