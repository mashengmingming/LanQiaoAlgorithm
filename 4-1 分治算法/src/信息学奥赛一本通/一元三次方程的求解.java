package 信息学奥赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/31
 * @Description
 */
public class 一元三次方程的求解 {
    static int a, b, c, d;
    static double x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        for (x = -100; x <= 100; x++) {// 枚举每个可能的根
            double x1 = x;  //确定根的可能区间
            double x2 = x + 1;
            if (f(x1) == 0)     //分别各个根的区间
                System.out.printf("%.2f ", x1);
            else if (f(x1) * f(x2) < 0) {
                while (x2 - x1 >= 0.001) {
                    double xx = (x2 + x1) / 2;
                    if ((f(x1) * f(xx)) <= 0) { // 根在左，调整右指针
                        x2 = xx;
                    } else {
                        x1 = xx;    //根在右，调整左指针
                    }
                }
                System.out.printf("#.2f ", x1);

            }
        }
        System.out.println();
    }

    public static double f(double x) {
        return (x * x * x * a + b * x * x + x * c + d);
    }
}
