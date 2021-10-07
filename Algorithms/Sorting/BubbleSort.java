import java.util.Scanner;
public class BubbleSort {

    public static void sort(int n , int arr[]) {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
    public static void asending(int n , int arr[]) {        
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        
    }
    public static void decending(int n , int arr[]) {
        for(int i=n-1;i>=0;i--) System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array:");
        int n= scan.nextInt();
        System.out.println("Enter "+n+" elements to be sorted.");
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        sort(n, arr);
        System.out.println("The aaray sorted in asending order:");
        asending(n, arr);
        System.out.println();
        System.out.println("The aaray sorted in desending order:");
        decending(n, arr);
        scan.close();
    }
}
