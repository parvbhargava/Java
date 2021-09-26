import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        System.out.println("Enter the String Here:");
        Scanner scan = new Scanner(System.in);
        String newString = scan.nextLine();
        // Method-1
        // for(int i=newString.length()-1;i>=0;i--){
        //     System.out.print(newString.charAt(i));
        // }
        //Method-2
        String rev = "";
        for(int i=newString.length()-1;i>=0;i--){
            rev = rev + newString.charAt(i);
        }
        System.out.println(rev);
        scan.close();
    }
}

