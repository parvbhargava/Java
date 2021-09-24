import java.util.Scanner;

public class Reverse_Num {
    public static void main(String[] args) {
        System.out.println("Enter the number to be reversed.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int reverse = 0;
        while(num!= 0){
            int rem = num%10;
            reverse = reverse*10 + rem;   
            num = num/10 ;
        }
        System.out.println("The reversed number is:"+ " "+ reverse);
        scan.close();
    }
}
