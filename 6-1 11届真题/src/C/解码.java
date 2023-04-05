package C;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/5
 * @Description
 */
public class 解码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= '9' && s.charAt(i) > '0') {
                int t = s.charAt(i) - '0';
                for (int j = 1; j < t; j++) {
                    System.out.print(s.charAt(i - 1));
                }
            } else {

                System.out.print(s.charAt(i));
            }
        }
    }
}
