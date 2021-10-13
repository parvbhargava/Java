import java.util.Scanner;

public class nthBinaryPlaindrome {
    public static boolean isPalindrome(int n) {
        String bin = Integer.toBinaryString(n);
        int counter =0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i) != bin.charAt(bin.length()-i-1)) counter++;  
        }
        if(counter == 0) return true;    
        return false;
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the nth for palindrome:");
        Integer n = scan.nextInt();
        int flag = 0;
        System.out.println("The "+n+"th palindrome is: ");
        for(int i=0;i<100;i++){
            if (isPalindrome(i)) {
                flag++;         
            }
            if(flag==n) {
                System.out.print(i);
                break;
            }
        }
        scan.close();
    }
}
