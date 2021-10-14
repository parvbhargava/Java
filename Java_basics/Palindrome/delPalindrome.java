import java.util.Scanner;
public class delPalindrome {
    public static boolean isPalindrome(String str) {
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = scan.next();
        int i=0; int flag=0;
        if(isPalindrome(str)) System.out.println("True");
        else{
            while (i<str.length()) {
                String s = "";
                for (int j = 0; j < str.length(); j++) {
                    if(j != i) s += str.charAt(i);
                }
                if (isPalindrome(s)) {
                    flag++;}
                i++;                
            }
            if (flag>0) System.out.println("True");
            else System.out.println("False");
        }
    
        scan.close();
    }

}