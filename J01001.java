import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long chieuDai = scanner.nextLong();
        long chieuRong = scanner.nextLong();
        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("0");
        } else {
            long chuVi = (chieuDai + chieuRong) * 2;
            long dienTich = chieuDai * chieuRong;
            System.out.println(chuVi + " " + dienTich);
        }
        scanner.close();
    }
}