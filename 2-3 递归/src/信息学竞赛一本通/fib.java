package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/28
 * @Description
 */
public class fib {
    static int[] a = new int[11];
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        System.out.println(fib(m));

    }
    public static int fib(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
