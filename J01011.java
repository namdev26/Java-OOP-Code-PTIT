import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            long a = scanner.nextLong();
            long b= scanner.nextLong();
            System.out.println(bcnn(a, b) + " " + ucln(a, b));

        }
        scanner.close();
    }

    public static long ucln ( long a, long b){
        if (b ==0){
            return a;
        }
        else {
            return ucln(b, a % b);
        }
    }

    public static long bcnn(long a, long b){
        return (a/ucln(a, b)) * b;
    }
}

