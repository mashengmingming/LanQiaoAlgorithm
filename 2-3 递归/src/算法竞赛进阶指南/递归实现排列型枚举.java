package 算法竞赛进阶指南;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/1
 * @Description
 */
public class 递归实现排列型枚举 {
    static int[] order = new int[20];
    static boolean[] chosen = new boolean[20];
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        calc(1);
    }
    public static void calc(int k){
        if(k == n+1){
            //问题边界
            for(int i = 1; i<=n; i++){
                System.out.print(order[i]);
            }
            System.out.println();
            return;
        }
        for(int i = 1; i<=n; i++){
            if(chosen[i])
                continue;
            order[k] = i;
            chosen[i] = true;

            calc(k+1);

            chosen[i] = false;
            order[k] = 0;
        }
    }
}
