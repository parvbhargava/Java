import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers:");
        Scanner scan = new Scanner(System.in);
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int hcf = 0;
        for(int i=1;i<=num1||i<=num2;i++){
            if(num1 % i ==0 && num2 % i ==0){
                hcf = i;
            }
        }
        System.out.println("The HCF is:"+hcf);
        scan.close();
    }
}
