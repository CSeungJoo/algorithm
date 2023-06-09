package deepening1;

import java.util.Scanner;
public class _10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] arr = s.split("");
        int returnValue = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i].equals(arr[(arr.length - 1) - i])) {
                returnValue += 0;
            }else {
                returnValue += 1;
            }
        }
        if(returnValue >= 1) System.out.println(0);
        else System.out.println(1);
    }
}
