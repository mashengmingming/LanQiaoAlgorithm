import java.util.*;

public class Template {

    static int N = 1000010;
    static int[] a = new int[N];
    static int[] b = new int[N];
    public static void insert(int[] b,int l,int r,int c){
        b[l] += c;
        b[r + 1] -= c;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for(int i = 1 ; i <= n ; i ++ ){
            a[i] = scan.nextInt();

            //我们可以不用构造b数组，直接一开始将a数组看成是00000，b是差分所以自然也都是0000
            //这一步操作的理解，意思大概跟上面构造的思路是一样的，
            //b[1] += a[1]    b[2] -= a[1]
            //b[2] += a[2]    b[3] -= a[2]
            //b[3] += a[3]    b[4] -= a[3]
            //然后我们求一下b数组的前缀和，就可以得到a数组
            //a[3] = b[1] + b[2] + b[3]
            //a[3] = a[1] - a[1] + a[2] - a[2] + a[3] // 可以看到还是a[3]，所以这种方案也是可以的
            insert(b,i,i,a[i]);
            //只要理解了a是b的前缀和之后，你就能明白这句代码
            //如果你不执行b[l] += c;b[r + 1] -= c;
            //这两句代码。而是直接b[l] += c;
            //那么你求前缀和的时候，你就知道，你求得不是前缀和了
            //你求得是b跟a是一样的了，因为是前缀和，所以后面的需要减去前面加的，
            //然后求前缀和的时候，就能消掉
        }

        //下面的操作跟第一种思路·是一样的
        while(m -- > 0){
            int l = scan.nextInt();
            int r = scan.nextInt();
            int c = scan.nextInt();
            insert(b,l,r,c);
        }
        for(int i = 1 ; i <= n ; i ++ ) {
            b[i] += b[i - 1];
            System.out.print(b[i] + " ");
        }
    }

}
