package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/24
 * @Description
 */
public class 排列骨牌问题 {
    static int n,i,j,a[] = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a[1] = 1;
        a[2] = 2;
        for(i = 3; i<=n; i++){
            a[i] = a[i-1] + a[i-2];
            System.out.println(a[i]);
        }
    }
}
