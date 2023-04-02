package AcWing;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/2
 * @Description
 */
public class 逆序对的数量 {
    // 满足i<j，且a[i] > a[j]
    static int n,res;
    static int a[] = new int[100010];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i<n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a,0,n-1);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                if(a[j] > a[i]){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
