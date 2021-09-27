/**The given series for natural log of 2 is:
        1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n **/

import java.util.Scanner;
public class NaturalLogarithmOftwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.println("Enter the number of terms:");
        n = scan.nextInt();
        for(double i=1; i<=n; i++){
            sum+=(1/i)*((Math.pow(-1,i)*(-1)));
        }
        scan.close();
        System.out.println("The sum of "+n+"terms is:"+sum);
    }
}
