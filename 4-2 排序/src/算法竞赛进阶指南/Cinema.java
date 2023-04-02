package 算法竞赛进阶指南;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/2
 * @Description
 */
public class Cinema {
    public static void main(String[] args) {
        //handle input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer,Integer> a = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            a.put(x,a.getOrDefault(x,0) + 1);
        }

        int m = sc.nextInt();

        int[] b = new int[m + 1];
        int[] c = new int[m + 1];
        for (int i = 1; i <= m ; i++) {
            int x = sc.nextInt();
            if(a.containsKey(x)) {
                b[i] = a.get(x);
            }
        }
        for (int i = 1; i <= m ; i++) {
            int x = sc.nextInt();
            if(a.containsKey(x)) {
                c[i] = a.get(x);
            }
        }

        int res = -1;
        int maxb = -1 , maxc = -1;

        for(int i = 1 ; i <= m ; i ++ )
        {
            int x = b[i], y = c[i];
            if(x > maxb) {
                res = i;
                maxb = x;
                maxc = y;
            }else if(x == maxb && y > maxc) {
                res = i;
                maxc = y;
            }
        }
        System.out.println(res);
    }

}
