package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/28
 * @Description
 */
public class 数的计数 {
    //递归公式 f（n）= 1+f(1)+f(2)+...+f(n/2)

    static int ans,n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(n);
        System.out.println(ans);
    }
    public static void dfs(int n){
        ans++;
        for(int i = 1; i<= n/2; i++){
            dfs(i);
        }
    }
}
