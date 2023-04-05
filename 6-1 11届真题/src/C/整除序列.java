package C;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/5
 * @Description
 */
public class 整除序列 {
    static long n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        while(n>0){
            System.out.print(n+" ");
            n /= 2;
        }
    }
}
