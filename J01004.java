import java.util.Scanner;

public class J01004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long test = scanner.nextLong();
        int cnt = 0;
        while (cnt < test) {
            long n = scanner.nextLong();
            int ok = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    ok =1;
                }
            }
            if ( ok == 1){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
            cnt ++;
        }
        scanner.close();
    }
}