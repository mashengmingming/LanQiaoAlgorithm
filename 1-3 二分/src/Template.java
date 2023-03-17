import java.util.*;

public class Template {
    static int N = 100010;
    static int[] a = new int[N];

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        for (int i = 0; i < n; i ++) a[i] = scan.nextInt();
        while (q -- > 0){
            int x = scan.nextInt();
            int l = 0, r = n - 1;
            while (l < r){
                int mid = l + r >> 1;
                if (a[mid] >= x) r = mid;
                else l = mid + 1;
            }

            if (a[l] != x) System.out.println(-1 + " " + -1);
            else{
                System.out.print(l + " ");

                l = 0; r = n - 1;
                while (l < r){
                    int mid = l + r + 1 >> 1;
                    if (a[mid] <= x) l = mid;
                    else r = mid - 1;
                }
                System.out.print(r);
                System.out.println();
            }
        }
    }
}

