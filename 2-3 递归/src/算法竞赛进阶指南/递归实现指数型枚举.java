package 算法竞赛进阶指南;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/1
 * @Description
 */

public class 递归实现指数型枚举 {

    public static boolean[] a = new boolean[20];		//定义全局数组
    public static int N;

    public static void dfs(int n){
        if(n > N){
            for(int i = 1;i <= n;i++)
                if(a[i] == true)
                    System.out.print(i + " ");
            System.out.println();
            return;		//到这里说明输出完毕了，必须“return”，退出此方法
        }

        a[n] = true;
        dfs(n+1);		//选了这个数

        a[n] = false;	//不选，所以要把标记标为false
        dfs(n+1);		//不选这个数
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        dfs(1);

    }

}