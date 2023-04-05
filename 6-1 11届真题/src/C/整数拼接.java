package C;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/5
 * @Description
 */
public class 整数拼接 {
    //拼接后的数要是k的倍数，s%k == 0
    static long res = 0, N, K;
    static long[] data = new long[100005];
    static long[][] cout = new long[11][100005];    // cout[a][b]: 乘以(a*10)时，余数为b的 个数

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        K = sc.nextLong();

        // (a[i]*pow(10, a[j])%k + a[j]%k)%k = 0
        //  a[i]*pow(10, a[j])%k
        for (int i = 1; i <= N; i++) {
            data[i] = sc.nextLong();
            for (int j = 1; j <= 10; j++) {
                int t = (int) (data[i]*Math.pow(10, j) % K);
                cout[j][t]++;
            }
        }

        // (a+b) % K == 0 --> (a%K + b%K) % K == 0 or (a%K + b%K) == 0
        for (int i = 1; i <= N; i++) {
            int len = (data[i]+"").length();
            int t1 = (int) (data[i] % K);                   // 在后
            int t2 = (int) (data[i]*Math.pow(10, len) % K); // 在前
            if (t1 == 0) {              // 当作后段，余数为零時
                res += cout[len][0];    // 找 前段长度len 且余数为零的数量
                if (t2 == 0) res--;     // 不能把同一个树同时放在前后两处(如果t2==0, 上句会把当前数多算一次)
            } else {                    // 当作后段，余数不为零時
                res += cout[len][(int) K-t1];
                if (t2+t1 == K) res--;  // 如果t2+t1==K,上句會把當前數多算一次(K-t1 == t2)
            }
        }

        System.out.println(res);
    }
}
