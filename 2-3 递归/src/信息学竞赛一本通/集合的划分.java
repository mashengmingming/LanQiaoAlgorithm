package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/28
 * @Description
 */
public class 集合的划分 {
    static int n,k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println(s(n, k));
    }
    public static int s(int n,int k){
        if((n<k) || (k==0))
            return 0;
        if((k==1) || (k==n))
            return 1;
        return s(n-1,k-1) + k*s(n-1,k);//调用下一层递归
    }
}
