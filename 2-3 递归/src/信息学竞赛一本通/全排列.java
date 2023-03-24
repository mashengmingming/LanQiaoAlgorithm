package 信息学竞赛一本通;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/28
 * @Description
 */
public class 全排列 {
    //递归：

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next();
            char[] cc =s.toCharArray();
            Arrays.sort(cc);
            perm(cc,0,cc.length-1);
        }
    }

    public static void perm(char[] cc ,int begin,int end) {
        if(begin == end) {
            System.out.println(cc);
            return ;
        }else {
            for(int i = begin;i<=end;i++) {
                swap(cc,begin,i);
                perm(cc,begin+1,end);
                swapback(cc,begin,i);
            }
        }
    }

    public static void swap(char[] cc , int a,int b) {
        char temp = cc[b];
        for(int i = b;i>a;i--) {
            cc[i]=cc[i-1];
        }
        cc[a]=temp;
    }
    public static void swapback(char[] cc , int a,int b) {
        char temp = cc[a];
        for(int i = a;i<b;i++) {
            cc[i]=cc[i+1];
        }
        cc[b]=temp;
    }
}
