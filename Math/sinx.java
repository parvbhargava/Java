import java.util.Scanner;

/**
 * sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......
 */
public class sinx {
    static double factorial(int num) {
        int fact=1;
        for(int j=1;j<=num;j++){
            fact=fact*j;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,n;
        double sinx=0;
        System.out.println("Enter the value of n here");
        n = scan.nextInt();
        System.out.println("Enter the value of x here");
        x = scan.nextInt();
        for(int i=0;i<=n;i++){
            sinx+=(Math.pow(-1,i)*(Math.pow(x, 1+2*i))/factorial(1+2*i));         
        }
        System.out.println("The value of sin(x) is:"+sinx);
        scan.close();
    }
}