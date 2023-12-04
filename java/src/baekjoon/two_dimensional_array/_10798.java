
import java.util.Scanner;
public class _10798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                arr[i][j] = ' ';
            }
        }

        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        sc.close();
        String s = "";

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(arr[j][i] == ' ') continue;
                s += (String.valueOf(arr[j][i]));
            }
        }
        System.out.print(s);
    }
}
