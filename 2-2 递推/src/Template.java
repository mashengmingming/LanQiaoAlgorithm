import java.util.*;

//数字三角形递推解法
public class Template {
    static int n,i,j;
    static int[][] a = new int[100][100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 1; i<=n; i++){
            for(j = 1; j<=i; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(i = n-1; i>=1; i--){
            for(j = 1; j<=i; j++){
                if(a[i+1][j]>=a[i+1][j+1])
                    a[i][j] += a[i+1][j];
                else
                    a[i][j] += a[i+1][j+1];
            }
        }
        System.out.println(a[1][1]);
    }
}

