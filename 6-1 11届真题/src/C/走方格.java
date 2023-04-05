package C;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/5
 * @Description
 */
public class 走方格 {
    static int N = 40;
    static int n,m;
    static int[][] a = new int[N][N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        a[1][1] = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(i == 1 && j == 1)
                    continue;
                if(i%2!=0 || j%2!=0){// 如果行号和列数都是偶数，不能走入这一格中
                    a[i][j] = a[i-1][j] + a[i][j-1];

                }
            }
        }
        System.out.println(a[n][m]);
    }
}
