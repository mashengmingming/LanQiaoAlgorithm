package 信息学竞赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/28
 * @Description
 */
public class Hanoi {
    static int k = 0,n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        mov(n,'a','c','b');
    }
    public static void mov(int n,char a,char b,char c){
        if(n == 0)
            return;
        mov(n-1,b,c,a);//用c作为协助，将a上的n-1片移到b
        k++;
        System.out.println(k+":from "+a+"-->"+c);
        mov(n-1,b,c,a);
    }
}
