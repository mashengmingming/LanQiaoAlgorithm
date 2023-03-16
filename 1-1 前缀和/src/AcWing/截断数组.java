package AcWing;
import java.util.Scanner;
/**
 * @Author 秋名山码神
 * @Date 2023/3/16
 * @Description
 */

public class 截断数组 {
    static int N = 100010;
    static int n, m;
    static long res;
    static int[] a = new int[N];
    static int[] s = new int[N];
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        for (int i = 1; i <= n; i ++) a[i] = scan.nextInt();
        for (int i = 1; i <= n; i ++) s[i] = s[i - 1] + a[i];

        if (s[n] % 3 != 0 || n < 3)
        {
            System.out.println(0);
            return;
        }

        int dex = s[n] / 3;
        for (int i = 1; i < n; i ++)
        {
            if (s[i] == dex * 2) res += m;
            if (s[i] == dex) ++ m;
        }

        System.out.println(res);
    }
}

