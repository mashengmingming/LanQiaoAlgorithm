package 信息学奥赛一本通;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/31
 * @Description
 */
public class 细胞 {
    static int next[][]={{0,1},{1,0},{0,-1},{-1,0}};//下一步
    static int flag[][];//标记是否走过

    public static class Q{
        int x;
        int y;
        public  Q(){};
        public  Q(int _x,int _y){x=_x;y=_y;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char arr[][]=new char[n][m];
        flag=new int[n][m];
        //输入
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.next().toCharArray();
        }
        //bfs，
        int count=0;//细胞个数
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                if (arr[i][j]!='0' && flag[i][j]==0) {//开始搜索
                    flag[i][j]=1;
                    LinkedList<Q> que=new LinkedList<细胞.Q>();
                    que.add(new Q(i,j));//添加首列
                    bfs(arr, i, j, que);count++;//搜索一次加一次
                }
            }
        }
        System.out.println(count);
    }

    public static void bfs(char arr[][],int x,int y,LinkedList<Q> que) {
        while (que.size()!=0) {
            Q first=que.poll();//取出头列，并删除
            for (int i = 0; i <4; i++) {
                int dx=first.x+next[i][0];
                int dy=first.y+next[i][1];
                if (dx>=0 && dx<arr.length && dy>=0 && dy<arr[0].length
                        && flag[dx][dy]==0 && arr[dx][dy]!='0') {
                    flag[dx][dy]=1;//标记走过
                    que.add(new Q(dx,dy));
                }
            }
        }
    }
}
