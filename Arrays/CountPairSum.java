import java.util.Scanner;

public class CountPairSum {
    
    public static int pairCounter(int n , int k , int arr[]) {
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            for(int j=0;j<arr.length;j++){
                if(i != j){
                    if(arr[j] + temp == k) counter++;
                }
            }
        }
        return counter/2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scan.nextInt();
        System.out.println("Enter "+n+" elements in the array :");
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        System.out.println("Enter the value of k :");
        int k = scan.nextInt();
        int counter = pairCounter(n, k, arr);
        System.out.println("Their are "+counter+" duplicate elements:");
        scan.close();
    }    
}
