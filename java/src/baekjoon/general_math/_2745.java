package baekjoon.general_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String hexInput = reader.readLine();

        String[] split = hexInput.split(" ");

        int B = Integer.parseInt(split[1], 10);
        int N = Integer.parseInt(split[0], B);

        System.out.println(N);
    }
}
