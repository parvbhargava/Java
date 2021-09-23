import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        double sum = 0;
        System.out.println("Enter the number:");
        num = scan.nextInt();
        // Converting the Number to Array.
        String temp = Integer.toString(num);
        int []numarr = new int[temp.length()];
        for(int i=0; i< temp.length();i++){
            numarr[i]=temp.charAt(i)-'0';
        }
        // Calculation for Armstrong Number
        for(int j=0; j<= temp.length()-1;j++){
            double temp1=numarr[j];
            sum = sum + Math.pow(temp1, 3);
        }
        // Checking for Armstrong Number
        if(num == sum){
            System.out.println("The given number is Armstrong Number.");
        }
        else{
            System.out.println("The given number is not Armstrong Number.");
        }   
        scan.close();
    }
}
