package C;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/5
 * @Description
 */
public class 超级胶水 {
    static int[] a = new int[10010];
    static long w,res,n;

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        n = sc.nextLong();
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            res += a[i]*w;
            w += a[i];
        }
        System.out.println(res);
    }
}
