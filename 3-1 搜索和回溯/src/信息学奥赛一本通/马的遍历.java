package 信息学奥赛一本通;

import java.util.Scanner;

/**
 * @Author 秋名山码神
 * @Date 2023/3/30
 * @Description
 */
public class 马的遍历 {
    static int N=10,n,m;
    static boolean[][] st=new boolean[N][N];
    static int[] dx=new int[] {-2,-1,1,2,2,1,-1,-2};
    static int[] dy=new int[] {1,2,2,1,-1,-2,-2,-1};
    static int res=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0) {
            n=sc.nextInt();
            m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            res=0;
            st[x][y]=true;
            dfs(x,y,1);
            st[x][y]=false; //恢复
            System.out.println(res);
        }
    }
    //cnt表示已走的点的数量
    static void dfs(int x,int y,int cnt) {
        //递归结束的条件 当访问完棋盘的所有点直接跳出当前dfs 再进行回溯
        //题目是计算可以有多少途径遍历棋盘上的所有点。
        if(cnt==n*m) {
            res++;
            return;
        }
        for (int i = 0; i < 8; i++) {
            int a=x+dx[i];
            int b=y+dx[i];
            if(a<0||a>=n||b<0||b>=m||st[a][b]) continue;
            st[a][b]=true;
            cnt++;
            dfs(a,b,cnt);
            //回溯
            cnt--;
            st[a][b]=false;
        }
    }
}
