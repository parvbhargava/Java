import java.util.Scanner;
public class zeroonetwo {
    public static void sort(int n,int arr[]) {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                    if(arr[j]>arr[j++]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }    
            }
        }        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        sort(n,arr);
        for(int i=0;i<arr.length;i++) System.out.print(arr[i]);
        scan.close();
    }
}
