import java.util.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            Set<Long> set = new HashSet<>();
            long n = scanner.nextLong();
            long sqrtN = (long) Math.sqrt(n);
            for (long i = 1; i <= sqrtN; i++) {
                if (n % i == 0) {
                    if (checkNT(i)) {
                        set.add(i);
                    }
                    if (i != n / i && checkNT(n / i)) {
                        set.add(n / i);
                    }
                }
            }
            List<Long> list = new ArrayList<>(set);
            Collections.sort(list); 
            Long ans = list.get(list.size() - 1);
            System.out.println(ans);
        }
        scanner.close();
    }

    public static boolean checkNT(long n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        long sqrtN = (long) Math.sqrt(n);
        for (long i = 3; i <= sqrtN; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
