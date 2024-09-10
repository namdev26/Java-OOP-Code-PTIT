import java.util.*;

public class J01025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1= scanner.nextInt();
        int y1= scanner.nextInt();
        int x2= scanner.nextInt();
        int y2= scanner.nextInt();
        int a1= scanner.nextInt();
        int b1= scanner.nextInt();
        int a2= scanner.nextInt();
        int b2= scanner.nextInt();
        int maxHoanh = Math.max(Math.max(x1,x2), Math.max(a1,a2)); // 8
        int minHoanh = Math.min(Math.min(x1,x2), Math.min(a1,a2)); // 1
        int maxTung = Math.max(Math.max(y1,y2), Math.max(b1,b2));  // 9
        int minTung = Math.min(Math.min(y1,y2), Math.min(b1,b2)); // 6
        int ans = Math.max(Math.abs(maxHoanh-minHoanh), Math.abs(maxTung - minTung));
        System.out.println(ans * ans);
        scanner.close();
    }
}
