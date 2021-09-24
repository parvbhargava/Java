import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        System.out.println("Enter the String Here:");
        Scanner scan = new Scanner(System.in);
        String newString = scan.nextLine();
        String temp = newString;
        String rev = "";
        for(int i=newString.length()-1;i>=0;i--){
            rev = rev + newString.charAt(i);
        }
        if(rev == temp){
            System.out.println("The given String is a Palindrome");
        }
        else{
            System.out.println("The given String is not a Palindrome");
        }
        scan.close();
    }
}
