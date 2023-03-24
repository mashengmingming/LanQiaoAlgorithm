package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/29
 * @Description
 */
public class 爬楼梯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<N; i++){
            System.out.println(climbStairs(arr[i]));
        }

    }
    public static int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        //n阶楼梯爬法拆解：第一步走了1阶+f(n-1)   第一步走了2阶+f(n-2)
        return climbStairs(n-1)+climbStairs(n-2);
    }

}
