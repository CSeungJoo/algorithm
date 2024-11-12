package baekjoon.divisors_multiples_and_prime_numbers;

import java.util.*;

public class _5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        Queue<Integer> firstQueue = new ArrayDeque<>();
        Queue<Integer> secondQueue = new ArrayDeque<>();
        while(true) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            if(first == 0 && second == 0)
                break;
            firstQueue.add(first);
            secondQueue.add(second);

            if (!sc.hasNextLine())
                break;
        }

        while(!firstQueue.isEmpty()) {
            String message = "multiple";
            int big = firstQueue.poll();
            int small = secondQueue.poll();

            if(big < small) {
                int temp = big;
                big = small;
                small = temp;
                message = "factor";
            }

            if(big % small != 0)
                message = "neither";

            System.out.println(message);
        }
    }
}
