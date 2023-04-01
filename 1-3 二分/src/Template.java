import java.util.*;

public class Template {
    static int N = 100010;
    static int[] a = new int[N];

    // 注意终止边界，左右区间取舍开闭情况
    /*
    扩大范围，取最大值
    while(l<r){
        int mid = (r+l) >> 1;
        不会取到r这个值
        if(a[mid] >= x)
            r = mid;
        else
            l = mid + 1;
    }

    缩小范围，取最小值
    while(l<r){
        int mid = (r+l+1) >> 1;
        if(a[mid] <= x)
            l = mid;
        else
            r = mid - 1;
    }

    （r+l+1)>>1,缩小范围，为了不取到l这个值，防止出现死循环
    >> 的用处，为了右移的时候向下取整，而/是向0取整，负数不适合
     */
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

