package 信息学奥赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/31
 * @Description
 */
public class 找数 {
    static int n, m;
    static int[] a = new int[110000];

    public static void main(String[] args) {
        // 改为二分
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++)
            a[i] = sc.nextInt();
        a[0] = -1;
        for (int i = 1; i <= m; i++) {
            int x;
            int left = 1, right = n, mid;
            x = sc.nextInt();
            // 重复二分
            while (left <= right) {
                mid = (left + right) / 2;
                // 排除条件，由于是升序序列
                if (a[mid] <= x)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            System.out.println(a[right]);
        }
    }
}
