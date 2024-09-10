import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            double n = scanner.nextDouble();
            double sqrt = Math.sqrt(n);
            int integer = (int) sqrt;
            if (integer * integer == n){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
