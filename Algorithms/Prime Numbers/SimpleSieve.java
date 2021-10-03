import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleSieve {

    public static void multipleof(int num) {
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Upper Bound for Prime:");
        int num = scan.nextInt();
        boolean prime[] = new boolean[num+1];
        for(int i=0;i<num;i++){            
            prime[i] = true;
        }
        for(int p=2;p*p<=num;p++){
            if(prime[p] == true){
                for(int i=p*p;i<=num;i+=p){
                    prime[i] = false;
                }
            }
        }
        System.out.println("Prime Numbers upto "+num+" are:");
        for(int i=2;i<=num;i++){
            if(prime[i] == true) System.out.print(i + " ");
        }
        scan.close();
    }
}
