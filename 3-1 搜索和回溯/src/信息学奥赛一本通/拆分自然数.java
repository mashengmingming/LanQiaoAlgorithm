package 信息学奥赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/29
 * @Description
 */
public class 拆分自然数 {
    static int n, total;
    static int[] a = new int[1001];//用来标记是否使用

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        search(n,1);
        System.out.println(total);
    }

    public static void search(int s, int t) {
        for (int i = a[t - 1]; i <= s; i++) {
            if (i < n) {
                //当前数要大于前一位，但不能超过n
                a[t] = i; //保存当前拆分的数i
                s -= i; //s继续拆分
                if (s == 0) {
                    //打印
                    print(s);
                } else {
                    search(s, t + 1); //当s>0，继续递归
                }
                s += i;//回溯，加上拆分的数
            }
        }
    }

    public static void print(int t) {
        System.out.println(n + '=');
        for (int i = 1; i <= t - 1; i++) {
            System.out.println(a[i] + '=');
        }
        System.out.println(a[t]);
        total++;
    }
}
