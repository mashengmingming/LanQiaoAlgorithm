package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/29
 * @Description
 */
public class fibArr {
    static int[] arr = new int[25];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            arr[i] = sc.nextInt();

        }

        for(int i = 1; i<=n; i++){
            System.out.println(fib(arr[i]));

        }

    }
    public static int fib(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
