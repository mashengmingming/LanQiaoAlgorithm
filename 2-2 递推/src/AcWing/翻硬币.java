package AcWing;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/24
 * @Description
 */
public class 翻硬币 {


    /**
     * @Author 秋名山码神
     * @Date 2023/1/31
     * @Description
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss1 = sc.next();
        String ss2 = sc.next();
        char[] s1 = ss1.toCharArray();
        char[] s2 = ss2.toCharArray();
        int cnt = 0;
        for (int i = 0; i < s1.length - 1; i++) {
            if (s1[i] != s2[i]) {
                cnt++;
                if (s1[i] == '*')
                    s1[i] = 'o';
                else
                    s1[i] = '*';

                if (s1[i + 1] == '*')
                    s1[i + 1] = 'o';
                else
                    s1[i + 1] = '*';
            }
        }
        System.out.println(cnt);
    }
}
