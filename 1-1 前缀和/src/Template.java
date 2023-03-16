import java.util.Scanner;

public class Template {
    static int N = 10000;
    static int n,m;
    static int[] a = new int[N];
    static int[] s = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 1; i<=n; i++)
            a[i] = sc.nextInt();
        for(int i = 1; i<=n; i++)
            s[i] = s[i-1] + a[i];
        while (m-- != 0){
            int l,r;
            l = sc.nextInt();
            r = sc.nextInt();
            System.out.println(s[r] - s[l-1]);
        }
    }
}
