import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t-- > 0){
            int ok =0;
            String s = scanner.nextLine();
            for (int i =0; i <s.length(); i++){
                if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2' ){
                    ok = 1;
                }
            }
            if (ok == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        scanner.close();
    }    
}
