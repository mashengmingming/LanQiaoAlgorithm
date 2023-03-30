package 信息学奥赛一本通;

/**
 * @Author 秋名山码神
 * @Date 2023/3/29
 * @Description
 */
public class 素数环 {
    static boolean[] b = new boolean[21]; // 存储数是否使用过
    static int total = 0;
    static int[] a = new int[21];

    public static void main(String[] args) {
        // 从1开始，每个空位都有20种可能，只需要保证：填入的数，与前一个不同，与左边相邻的数和是素数
        search(1);
        System.out.println(total);
    }


    //搜索
    public static void search(int t) {
        for (int i = 1; i <= 20; i++) {
            if (pd(a[t - 1], i) && (!b[i])) {
                //不是素数，并且没被使用
                a[t] = i;
                b[i] = true;
                if (t == 20) {
                    if (pd(a[20], a[1]))
                        print();
                } else {
                    search(t + 1);
                }
                b[i] = false;
            }
        }
    }

    public static void print() {
        total++;
        System.out.println('<' + total + '>');
        for (int j = 1; j <= 20; j++) {
            System.out.println(a[j]);
        }
    }

    //判断素数
    public static boolean pd(int x, int y) {
        int k = 2, i = x + y;
        while (k <= Math.sqrt(i) && i % k != 0)
            k++;
        if (k > Math.sqrt(i))
            return true;
        else
            return false;
    }
}
