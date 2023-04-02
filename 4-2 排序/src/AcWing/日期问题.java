package AcWing;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/4/2
 * @Description
 */
public class 日期问题 {
    static int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean check(int year, int month, int day) {
        if (month == 0 || month > 12) return false;
        if (day == 0 || month != 2 && day > days[month]) return false;
        if (month == 2) {
            int leap = 0;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                leap = 1;
            if (day > 28 + leap) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] s = scan.next().split("/");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        for (int i = 19600101; i <= 20591231; i++) {
            int year = i / 10000;
            int month = i % 10000 / 100;
            int day = i % 100;
            if (check(year, month, day)) {
                if (year % 100 == a && month == b && day == c || //年/月/日
                        month == a && day == b && year % 100 == c || //月/日/年
                        day == a && month == b && year % 100 == c)//日/月/年
                {
                    System.out.printf("%d-%02d-%02d\n", year, month, day);
                }
            }
        }
    }
}
