package AcWing;

/**
 * @Author 秋名山码神
 * @Date 2023/3/17
 * @Description
 */
import java.util.*;

public class 我在哪{
    static int N = 110;
    static int n;
    static String s;


    public static boolean check(int mid){
        Map<String, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i <= n - mid; i ++){
            String t = s.substring(i, i + mid);
            if (map.get(t) == null) map.put(t, 1);
            else  map.put(t, map.get(t) + 1);
            max = Math.max(map.get(t), max);
            if (max != 1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        s = scanner.next();

        int l = 1,r = n;
        while(l<r){
            int mid = (l+r)/2;
            if(check(mid))
                r = mid;
            else l = mid+1;
        }
        System.out.println(l);
    }
}

