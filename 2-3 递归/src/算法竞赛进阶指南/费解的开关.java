package 算法竞赛进阶指南;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/1
 * @Description
 */
public class 费解的开关 {
    static int step = 7;
    static int bg[][] = new int[10][10];//目标数组和其复制版的操作数组
    static int g[][] = new int[10][10];
    static int[] dx = new int[]{0, -1, 0, 1, 0};//寻找当前目标的上下左右位置
    static int[] dy = new int[]{0, 0, -1, 0, 1};


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            for (int i = 0; i < 5; i++) {
                String s = scan.next();
                for (int j = 0; j < 5; j++)
                    g[i][j] = s.charAt(j) - '0';
            }
            int a = work();
            System.out.println(a);
            step = 7;
        }

    }

    //翻转当前目标和其上下左右位置的状态
    static void turn(int x, int y) {
        for (int i = 0; i < 5; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a >= 0 && a < 5 && b >= 0 && b < 5) {
                bg[a][b] = 1 - bg[a][b];
            }
        }
    }

    static int work() {

        for (int i = 0; i < 32; i++) {
            int num = 0;

            for (int u = 0; u < 5; u++)
                for (int v = 0; v < 5; v++)
                    bg[u][v] = g[u][v];

            for (int j = 0; j < 5; j++) {//进行第一行32种情况的枚举
                if ((i >> j & 1) == 0) {
                    num++;
                    turn(0, j);
                }
            }


            for (int j = 0; j < 4; j++) {//从第一行的情况把2，3，4行全部确定
                for (int k = 0; k < 5; k++) {
                    if (bg[j][k] == 0) {
                        num++;
                        turn(j + 1, k);
                    }
                }
            }
            boolean success = true;
            for (int j = 0; j < 5; j++) {//若第五行有灭的开关，表示这种情况不满足条件
                if (bg[4][j] == 0) {
                    success = false;
                }
            }

            if (success && step > num) {//寻找满足条件的最小步数
                step = num;
            }
        }
        if (step > 6) {
            return -1;
        }
        return step;
    }
}


