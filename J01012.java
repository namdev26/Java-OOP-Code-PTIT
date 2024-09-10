import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long cnt = 0;
            for (int i = 1; i <= (long)Math.sqrt(n); i++) {
                if (n % i == 0 && n / i != i) {
                    if (i % 2 == 0) {
                        cnt++;
                    }
                    if ((n/i)  % 2 ==0){
                        cnt++;
                    }
                }
                if (n % i == 0 && n / i == i) {
                    if (i % 2 == 0) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
        scanner.close();
    }
}
