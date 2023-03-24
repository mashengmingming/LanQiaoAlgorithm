package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/24
 * @Description
 */
public class 放苹果 {
    static int N, M,i,k,t;
    //M个苹果放到N个篮子里，允许有盘子空着，问有多少种放法
    static int a[][] = new int[11][11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (i = 0; i < t; i++) {
            N = sc.nextInt();
            M = sc.nextInt();
            for (i = 1; i <= 10; i++) {
                a[i][1] = 1;  //只有一个盘子的时候放法只有1种
                a[1][i] = 1;  //只有一个苹果的时候放法只有1种
                a[0][i] = 1;  //没有苹果的时候方法只有1种
            }
            for (i = 2; i <= N; i++) {
                for (k = 2; k <= M; k++) {
                    if (i < k) //如果盘子数量大于苹果数量
                    {
                        a[i][k] = a[i][i]; //应该计算i个苹果i个盘子的结果
                    } else   //如果盘子数量小于等于苹果数量
                    {
                        a[i][k] = a[i][k - 1] + a[i - k][k];
                    }
                }
            }
        }
        System.out.println(a[N][M]);
    }
}
