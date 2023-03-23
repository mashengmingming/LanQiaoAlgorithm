package AcWing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/23
 * @Description
 */
public class 砖块 {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T -- > 0)
        {
            int n = scan.nextInt();
            String ss = scan.next();
            char [] s = ss.toCharArray();

            int w_cnt = 0;
            int b_cnt = 0;
            for (int i = 0; i < n ; i ++)
            {
                if (s[i] == 'W')
                    w_cnt ++;
                else
                    b_cnt ++;
            }

            if (w_cnt % 2 == 1 && b_cnt % 2 == 1)
            {
                System.out.println(-1);
            }
            else
            {
                int res_cnt = 0;
                List<Integer> res = new ArrayList();
                if (w_cnt % 2 == 1)     ////w是奇数个，b是偶数个。则b要变w
                {
                    int i = 0;
                    while (i < n - 1)
                    {
                        if (s[i] == 'B' && s[i+1] == 'B')
                        {
                            s[i] = 'W';
                            s[i+1] = 'W';
                            res_cnt ++ ;
                            res.add(i + 1);
                            i += 2;
                        }
                        else if (s[i] == 'B' && s[i+1] == 'W')
                        {
                            s[i] = 'W';
                            s[i+1] = 'B';
                            res_cnt ++;
                            res.add(i + 1);
                            i ++;
                        }
                        else if (s[i] == 'W')
                        {
                            i ++;
                        }
                    }
                }
                else        //w要变b
                {
                    int i = 0;
                    while (i < n - 1)
                    {
                        if (s[i] == 'W' && s[i+1] == 'W')
                        {
                            s[i] = 'B';
                            s[i+1] = 'B';
                            res_cnt ++;
                            res.add(i + 1);
                            i += 2;
                        }
                        else if (s[i] == 'W' && s[i+1] == 'B')
                        {
                            s[i] = 'B';
                            s[i+1] = 'W';
                            res_cnt ++;
                            res.add(i + 1);
                            i += 1;
                        }
                        else if (s[i] == 'B')
                        {
                            i ++;
                        }
                    }
                }

                if (res_cnt > 0)
                {
                    System.out.println(res_cnt);
                    for (int x : res)
                    {
                        System.out.print(x);
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                else
                {
                    System.out.println(0);
                }
            }
        }
    }
}
