/*We are printimg the sum of this series: 
    1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n */ 

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double sum=0;
        System.out.println("Enter the number of terms in series");
        n = scan.nextInt();
        for(double i=1;i<=n;i++){
            sum+=1/i;
        }
        System.out.println("The sum of series is:"+sum);
        scan.close();
    }
}
