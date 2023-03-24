package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/29
 * @Description
 */
public class 最大公约数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (a <= 0 || b <= 0)
            return 0;
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }
}
