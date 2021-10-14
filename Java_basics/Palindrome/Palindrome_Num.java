import java.util.Scanner;

public class Palindrome_Num {
    public static void main(String[] args) {
        System.out.println("Enter the number here:");
        Scanner scan = new Scanner(System.in);
        int  num = scan.nextInt();
        int temp = num;
        int reverse = 0;
        while(num!=0){
            int rem = num%10;
            reverse = reverse*10 + rem;
            num=num/10; 
        }
        if(temp == reverse){
            System.out.println("The given Nummber is a palindrome.");
        }
        else{
            System.out.println("The given number is not a palindrome.");
        }
        scan.close();
    }
}
