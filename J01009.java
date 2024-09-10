import java.util.Scanner;

public class J01009 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ans = 1;
        long res = 0;
        for ( int i = 1; i <= n; i++){
            ans = ans * i;
            res = res + ans;
        }
        System.out.println(res);
        scanner.close();
   }
}