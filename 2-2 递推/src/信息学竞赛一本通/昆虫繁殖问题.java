package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/24
 * @Description
 */
public class 昆虫繁殖问题 {
    static int x, y, z, i, j;
    static long a[] = new long[101], b[] = new long[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        for (i = 1; i <= x; i++) {
            a[i] = 1;
            b[i] = 0;
        }
        for (i = x + 1; i <= z + 1; i++) {
            b[i] = y * a[i - x];
            a[i] = a[i - 1] + b[i - 2];
        }
        System.out.println(a[z+1]);
    }
}
