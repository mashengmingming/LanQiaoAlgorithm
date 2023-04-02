import java.util.Arrays;
import java.util.Scanner;

public class Template {
    static int n;
    static int[] a = new int[120];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i<n; i++)
            a[i] = sc.nextInt();
        //排序函数的使用
        Arrays.sort(a,0,n);

        for(int i = 0; i<n; i++)
            System.out.println(a[i]);
    }
}
