import java.util.Scanner;

public class isBinaryPalindrome {
    public static void ispalindrome(String bin){
        int counter = 0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i) != bin.charAt(bin.length()-i-1)) counter++;
        }
        System.out.println((counter == 0)?"is palindrome":"not palindrome");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        String bin = Integer.toBinaryString(n);
        ispalindrome(bin);
        scan.close();
    }
}
