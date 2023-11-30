package baekjoon.deepening1;

import java.util.Scanner;

public class _25206 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double creditSum = 0, result = 0;

        for (int i = 0; i < 20; i++) {
            String s = sc.nextLine();
            String[] sArr = s.split(" ");

            double credit = 0, grade = 0;
             credit += Double.parseDouble(sArr[1]);

                switch (sArr[2]) {
                    case "A+":
                        grade += 4.5;
                        break;
                    case "A0":
                        grade += 4.0;
                        break;
                    case "B+":
                        grade += 3.5;
                        break;
                    case "B0":
                        grade += 3.0;
                        break;
                    case "C+":
                        grade += 2.5;
                        break;
                    case "C0":
                        grade += 2.0;
                        break;
                    case "D+":
                        grade += 1.5;
                        break;
                    case "D0":
                        grade += 1.0;
                        break;
                    case "F":
                        grade += 0;
                        break;
                    case "P":
                        grade += 0;
                        credit = 0;
                        break;
                }
                creditSum += credit;
                result += credit * grade;
        }
        sc.close();
        System.out.println(result/creditSum);
    }
}