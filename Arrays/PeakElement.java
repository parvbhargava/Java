import java.util.Scanner;

public class PeakElement {
    
    public static void peakElelment(int n , int[] arr) {
        if(n>1){
            for(int i=1;i<=n-2;i++){
                if(arr[0] > arr[1]){
                    System.out.println("1");
                    break;
                 }
                else if(arr[n-1] > arr[n-2]) {
                    System.out.println("1");
                    break;
                }
                else if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                        System.out.println("1");
                        break;
                    }
                else System.out.println("0");        
                }
        }
        else System.out.println("0");
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = scan.nextInt();
        int []arr = new int[n];
        System.out.println("Enter "+n+" elements for array:");
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        System.out.println("The boolean values are");
        peakElelment(n,arr);
        scan.close();

    }
}