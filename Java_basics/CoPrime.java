// You have been given numbers ‘x’ and ‘y’. Print all the numbers between 1 and x which follow the below
// criteria
// 1. Should be co-prime with x
// 2. Should be divisible by ‘y’

import java.util.Scanner;

public class CoPrime {

    public static int hcf(int a ,int b) {
        int hcf=0;
        for(int i=1;i<b;i++){
            if(a%i == 0 && b%i==0) hcf = i;
        }
        return hcf;            
    }
    public static boolean iscoprime(int i , int x) {
        if(hcf(i, x) == 1) return true;
        return false;       
    }
    public static boolean isdivisible(int i , int y) {
        if(i%y == 0) return true;
        return false;        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for x:");
        int x = scan.nextInt();
        System.out.println("Enter value for y:");
        int y = scan.nextInt();
        System.out.println("Result:");
        for(int i=1;i<x;i++){
            System.out.print((iscoprime(i, x) && isdivisible(i, y))?i+" ":"");
        }
        scan.close();
    }
}
