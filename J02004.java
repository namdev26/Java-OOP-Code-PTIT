import java.util.*;

public class J02004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t--> 0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for ( int i  = 0; i < n; i++){
                a[i] = scanner.nextInt();
            }
            int left = 0;
            int right = n-1;
            int ok = 0;
            while (left < right){
                if (a[left] != a[right]){
                    ok = 1;
                    break;
                }
                else {
                    left++;
                    right--;
                }
            }
            if (ok ==0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
