package AcWing;

/**
 * @Author 秋名山码神
 * @Date 2023/3/17
 * @Description
 */
import java.util.*;

public class 改变数组元素{
    static int N = 200010;
    static int n, x;
    static int[] b = new int[N];
    public static void insert(int l, int r, int c){
        b[l] += c;
        b[r + 1] -= c;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while (T -- > 0){
            n = scan.nextInt();
            Arrays.fill(b, 0); // 多组测试数据，每次清空一下差分数组

            for (int i = 1; i <= n; i ++){
                x = scan.nextInt();
                if (x != 0) insert(Math.max(1, i-x+1), i, 1); //将以i为结尾的x个元素都+1，后面元素-1，差分
            }

            for (int i = 1; i <= n; i ++){
                b[i] += b[i - 1];  //求一下差分数组，前缀和
                System.out.print(Math.min(1, b[i]) + " "); //将所有大于1的元素都定于1
            }
            System.out.println();
        }
    }
}

