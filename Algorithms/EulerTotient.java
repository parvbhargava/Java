import java.util.Scanner;
public class EulerTotient {
    
    public static int hcf(int a , int b) {
        if(a==0){
            return b;
        }
        return hcf(b%a , a);    
    }
    public static int phi(int n) {
        int res = 1;
        for(int i=2;i<n;i++){
            if(hcf(i,n) == 1) res++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        System.out.println("The value of phi("+n+") is");
        System.out.println(phi(n));
        scan.close();
    }
}
