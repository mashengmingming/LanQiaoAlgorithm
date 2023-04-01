package 算法竞赛进阶指南;

/**
 * @Author 秋名山码神
 * @Date 2023/4/2
 * @Description
 */
public class 分书_二分判定 {
    static int n,m;
    static int[] a = new int[n];
    public static void main(String[] args){
        int l = 0, r = a.length;
        for(int i = 1; i<=n; i++){
            if(l<r){
                int mid = (l+r) >> 1;
                if(valid(mid))
                    r = mid;
                else
                    l = mid + 1;
            }
        }
        System.out.println(l);
    }

    //把n本书分为m组，每组的厚度之和<= size ，是否可行
    public static boolean valid(int size){
        int group = 1, rest = size;
        for(int i = 1; i<=n; i++){
            if(rest >= a[i])
                rest -= a[i];
            else {
                group++;
                rest = size - a[i];
            }
        }
        return group <= m;
    }
}
