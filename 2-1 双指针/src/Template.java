import java.util.*;

public class Template {
    static int N = 100010;
    static int n;
    static int[] a = new int[N];
    static int[] w = new int[N];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        for (int i = 0; i < n; i++) a[i] = scan.nextInt();

        int res = 0;
        for (int i = 0, j = 0; i < n; ) {
            while (i < n && w[a[i]] == 0) w[a[i++]]++;
            res = Math.max(res, i - j);
            while (w[a[i]] == 1) {
                w[a[j]]--;
                j++;
            }
        }
        System.out.println(res);
    }
}

