package codeup.dfs_bfs;

import java.util.Scanner;
import java.util.Stack;

public class _2062 {

    public static void dfs(int[][] arr) {
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        Stack<Integer> stack = new Stack<Integer>();
        int[] resultArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == -1 || visited[i][j])
                    continue;

                stack.push(arr[i][j]);
                visited[i][j] = true;
                int cnt = 1;
                int ii = i, jj = j;
                Stack<Character> last = new Stack<>();
                while(!stack.empty()) {
                    if (ii < arr.length - 1)
                        if (arr[ii + 1][jj] == arr[ii][jj] && !visited[ii + 1][jj]) {
                            stack.push(arr[++ii][j]);
                            visited[ii][jj] = true;
                            last.push('s');
                            cnt += 1;
                            continue;
                        }
                    if(jj < arr[0].length - 1 && !visited[ii][jj + 1])
                        if (arr[ii][jj + 1] == arr[ii][jj]) {
                            stack.push(arr[ii][++jj]);
                            visited[ii][jj] = true;
                            last.push('d');
                            cnt += 1;
                            continue;
                        }
                    if (jj > 0 && !visited[ii][jj - 1]) {
                        if (arr[ii][jj - 1] == arr[ii][jj]) {
                            stack.push(arr[ii][--jj]);
                            visited[ii][jj] = true;
                            last.push('a');
                            cnt += 1;
                            continue;
                        }
                    }
                    if (ii > 0 && !visited[ii - 1][jj]) {
                        if(arr[ii - 1][jj] == arr[ii][jj]) {
                            stack.push(arr[--ii][jj]);
                            visited[ii][jj] = true;
                            last.push('w');
                            cnt += 1;
                            continue;
                        }
                    }
                    if (!last.empty()) {

                        char pop = last.pop();
                        if (pop == 's') {
                            ii--;
                        }else if(pop == 'd') {
                            jj--;
                        }else if(pop == 'a') {
                            jj++;
                        }else {
                            ii++;
                        }
                    }
                    stack.pop();
                }

                resultArr[arr[i][j]] = Math.max(resultArr[arr[i][j]], cnt);
            }
        }

        for (int i = 0; i < resultArr.length; i++) {
            if (resultArr[i] != 0)
                System.out.println(i +" "+ resultArr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        dfs(arr);
    }
}

//        4 5 6 7 8 9 0 1
//        1 1 1 4 4 4 1 2
//        3 4 5 2 4 3 5 7
//        1 4 4 4 4 5 6 9
 //       0 0 0 1 2 4 2 3
   //     6 7 3 4 2 4 1 3
     //   0 9 1 5 4 3 6 2

// 추후 dxdy = [(0, 1), (1, 0), (-1, 0), (0, -1)] 로 수정 예정