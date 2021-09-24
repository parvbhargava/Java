import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("The given Number is prime.");
        }
        else{
            System.out.println("The given Number is not prime.");
        
        }
        scan.close();
    }
}
