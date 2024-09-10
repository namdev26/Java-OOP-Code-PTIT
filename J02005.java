import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc kích thước của hai mảng
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Khởi tạo và đọc giá trị cho mảng a và b
        int[] a = new int[n];
        int[] b = new int[m];
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        
        // Khởi tạo Set để lưu các phần tử chung
        Set<Integer> set = new HashSet<>();
        
        // Duyệt qua các phần tử của mảng a
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    set.add(a[i]);
                }
            }
        }
        
        List<Integer> list = new ArrayList<>(set);
        
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); 
        
        scanner.close();
    }
}
