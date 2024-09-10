import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int count = 0;
        while(count < test){
            long n = scanner.nextLong();
            System.out.println(((n + 1)*n)/2);
            count ++;
        }
        scanner.close();
    }
}