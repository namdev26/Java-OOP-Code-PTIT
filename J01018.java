import java.util.*;

public class J01018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (checkTong(n) && checkKhoangCach(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    private static boolean checkTong(int n) {
        int ans = 0;
        while (n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return (ans % 10 == 0);
    }

    private static boolean checkKhoangCach(int n) {
        String st = String.valueOf(n);
        for (int i = 0; i < st.length() - 1; i++) {
            int a = st.charAt(i) - '0'; 
            int b = st.charAt(i + 1) - '0'; 
            if (Math.abs(a - b) != 2) { 
                return false;
            }
        }
        return true;
    }
}
