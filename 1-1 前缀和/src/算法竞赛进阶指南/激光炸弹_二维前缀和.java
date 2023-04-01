package 算法竞赛进阶指南;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/2
 * @Description
 */
public class 激光炸弹_二维前缀和 {
    static int N;
    static int R;
    static int NN = 5010;
    static int s[][] = new int[NN][NN];
    static int n,m;//n和m分别为棋盘的最大右下角坐标

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        R = sc.nextInt();
        R = Math.min(5001,R);//R的取值范围远大于xi,yi,所以要取一下最小值(以最小的R覆盖所有x,y)
        n = m = R;// 待会枚举右下角
        while (N-- >0){
            int x,y,w;
            x = sc.nextInt();
            y = sc.nextInt();
            w = sc.nextInt();
            x++;y++;//因为边界问题，所有坐标不小于1，所以x++，y++,图像向右向下移动一格
            n = Math.max(n, x);
            m = Math.max(m, y);
            s[x][y] += w;
        }
        //预处理前缀和
        //因为只有一个数组，所以 s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + s[i][j]
        // s[i][j] += s[i-1][j] + s[i][j-1] - s[i-1][j-1]
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                s[i][j] += s[i-1][j] + s[i][j-1] - s[i-1][j-1];
            }
        }
        int res = 0;
        //枚举所有边长为R的矩形，枚举（i,j）为右下角
        for (int i = R; i <= n; i++) {
            for (int j = R; j <= m ; j++) {
                res = Math.max(res,s[i][j] - s[i-R][j] - s[i][j-R] + s[i-R][j-R]);
            }
        }
        System.out.println(res);
    }
}
