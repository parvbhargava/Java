import java.util.Scanner;

public class CircularElementShift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the size of array:");
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements for Array");
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        int last = arr[n-1];                     
        for(int i=4;i>0;i--) arr[i] = arr[i-1];
        arr[0] = last;
        System.out.println("The output after circular element shift is :");
        for(int i=0;i<n;i++) System.out.print(arr[i]+ " ");
        scan.close();
    }
}
