
import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
            set.add(b[i]);
        }
        
        for (int x : set){
            System.out.print(x + " ");
        }
        scanner.close();
    }
}
