import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long[] fibo = new long[95];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        java.util.HashSet<Long> fiboSet = new java.util.HashSet<>();
        for (long num : fibo) {
            fiboSet.add(num);
        }
        while (t-- > 0) {
            long n = scanner.nextLong();
            if (fiboSet.contains(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
