import java.util.Scanner;

public class LCM {
    public static int hcf(int a , int b) {
        int hcf=0;
        for(int i=1;i<b;i++){
            if(a%i==0 && b%i==0) hcf = i;
        }
        return hcf;

    }
    public static int lcm(int hcf , int a ,int b) {
        int lcm = (a*b)/hcf(a,b);
        return lcm;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number for LCM");
        int a = scan.nextInt();
        System.out.println("Enter Second number for LCM");
        int b = scan.nextInt();
        scan.close();
        int hcf = hcf(a,b);
        int lcm = lcm(hcf,a,b);
        System.out.println("LCM of "+a+" and "+b+" is "+lcm);
    }
}
