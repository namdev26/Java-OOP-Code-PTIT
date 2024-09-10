import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            long[] fibo = new long[95];
            fibo[1] = 1;
            fibo[2] = 1;
            for (int i =3; i <=n; i++){
                fibo[i] = fibo[i-1] + fibo[i-2];
            } 
            System.out.println(fibo[n]);
        }
        scanner.close();
    }
}