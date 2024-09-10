import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long test = scanner.nextLong();
        int cnt = 0;
        while (cnt < test) {
            double n = scanner.nextDouble();
            double h = scanner.nextDouble();
            for(int i = 1; i <= n-1; i++){
                double ans = Math.sqrt((h*h*i)/n);
                System.out.printf("%.6f",ans);
            }
            System.out.println();
            cnt ++;
        }
        scanner.close();
    }
}