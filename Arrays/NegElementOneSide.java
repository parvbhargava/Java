import java.util.Scanner;
public class NegElementOneSide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the lenght of array: ");
        int n = scan.nextInt();
        System.out.println("Enter "+n+" elements for the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int pos = 0 , neg =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) pos++;
            else neg++;
        }
        int posarr[] = new int[pos];
        int negarr[] = new int[neg];
        int count1 =0 , count2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) {
                posarr[count1] = arr[i] ;
                count1++;
            }
            else{
                negarr[count2] = arr[i];
                count2++;
            }
        }
        int resarr[] = new int[n];
        System.arraycopy(posarr, 0, resarr, 0, posarr.length);
        System.arraycopy(negarr, 0 , resarr, posarr.length, negarr.length);
        System.out.println("The reult is: ");
        for (int i = 0; i < resarr.length; i++) {
            System.out.print(resarr[i]+" ");
        }   
        scan.close();
    }
}
