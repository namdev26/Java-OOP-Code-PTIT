import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0){
            String num = scanner.nextLine().trim();
            System.out.println(cutHaft(num));
        }
        scanner.close();
    }
    public static String cutHaft(String num) {
        StringBuilder sb = new StringBuilder();
        for ( int i =0; i < num.length(); i++){
            if (num.charAt(i) == '0' || num.charAt(i) == '1' || num.charAt(i) == '8' ||num.charAt(i) == '9'){
                if (num.charAt(i) == '0' || num.charAt(i) == '8' ||num.charAt(i) == '9'){
                    sb.append('0');
                }
                else{
                    sb.append('1');
                }
            }
            else{
                return "INVALID";
            }
        }
        while (sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        if (sb.length() == 0) {
            return "INVALID";
        }
        return sb.toString();
    }
}
