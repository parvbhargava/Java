import java.util.Scanner;
public class ElementFrequency {
    public static int frequency(int num , int arr[]) {
        int f=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num) f++;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lenght of array:");
        int n = scan.nextInt();
        System.out.println("Enter "+n+" elements in array.");
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        System.out.println("The value of integer to calculate frequency:");
        int num = scan.nextInt();
        int f = frequency(num, arr);
        System.out.println("The frequency of "+num+" is "+f+".");
        scan.close();
    }
}
