import java.util.Scanner;

public class kthSmallestValue {
    
    public static void sort(int n, int k, int arr[]) {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scan.nextInt();
        System.out.println("Enter "+n+" elements in array:");
        int arr[]= new int[n];
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        System.out.println("Enter the value for k:");
        int k = scan.nextInt();
        sort(n, k, arr);
        System.out.println("The "+k+" smallest value is:   "+arr[k-1]);
        System.out.println("The "+k+" largest  value is:   "+arr[arr.length-k]);
        scan.close();
    }
}
