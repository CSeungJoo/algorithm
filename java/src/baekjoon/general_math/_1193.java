package baekjoon.general_math;

import java.util.Scanner;

public class _1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int X = sc.nextInt(), line = 1;

        sc.close();

        while(X - line > 0) {
            X -= line;
            line++;
        }

        if(line % 2 == 1)
            System.out.println((line + 1 - X) +"/"+ X);
        else
            System.out.println(X +"/"+ (line + 1 - X));
    }
}
