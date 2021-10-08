import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n  = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elments in array:");
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        int flag = 0;
        for(int i=0;i<n-1;i++){
            if(i+1!= arr[i]) {
                flag += i+1;
                break;
            }
        }
        System.out.println("The missing number is: "+flag);
        scan.close();
    }
}
