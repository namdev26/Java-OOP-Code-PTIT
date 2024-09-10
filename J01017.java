import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  
        scanner.nextLine();
        while (t-- > 0){
            int ok =0;
            String s = scanner.nextLine();
            for ( int i =1; i < s.length(); i++){
                if ((int)(s.charAt(i)) - (int)(s.charAt(i-1)) != 1 && (int)(s.charAt(i)) - (int)(s.charAt(i-1)) != -1){
                    ok =1;
                }
            }
            if (ok ==1){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
        scanner.close();
    }
}

