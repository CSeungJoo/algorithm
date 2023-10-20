package baekjoon.deepening1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] strArr = new String[N];

        for (int i = 0; i < N; i++) {
            strArr[i] = sc.next();
        }
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < strArr[i].length(); j++) {
                char a = strArr[i].charAt(1);

                while(strArr[i].contains(Character.toString(a))) {

                }
            }
        }
    }
}