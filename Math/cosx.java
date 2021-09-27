import java.util.Scanner;
/**
 * cos x = 1 - x2/2! + x4/4! - x6/6! .....
 */
public class cosx {
    static double factorial(int num){
        double fact=1;
        for(int j=1;j<=num;j++){
            fact=fact*j;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,n;
        double cosx=1;
        System.out.println("Enter the value for x");
        x = scan.nextInt();
        System.out.println("Enter the value for n");
        n = scan.nextInt();
        for(int i=1;i<=n;i++){
            cosx+=Math.pow(-1,i)*(Math.pow(x, 2*i)/factorial(2*i));
        }
        System.out.println("The value of cos(x) is:"+"  "+cosx);
        scan.close();

    }
}
