import java.math.BigInteger;
import java.util.*;

public class J03033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t--> 0){
            BigInteger a = new BigInteger(scanner.nextLine());
            BigInteger b = new BigInteger(scanner.nextLine());

            System.out.println(bcnn(a, b));

        }
        scanner.close();
    }
    public static BigInteger bcnn(BigInteger a, BigInteger b){
        return a.multiply(b).divide(a.gcd(b));
    }
}
