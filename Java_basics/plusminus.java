import java.text.DecimalFormat;
import java.util.Scanner;

public class plusminus {

    public static void logic(int arr[]) {
        double pos=0;
        double neg=0;
        double zero=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) neg++;
            else if( arr[i]> 0) pos++;
            else zero++;
        }
        DecimalFormat df= new DecimalFormat("#.000");
		System.out.println(df.format(pos/arr.length));
		System.out.println(df.format(neg/arr.length));
		System.out.println(df.format(zero/arr.length));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        logic(arr);
        scan.close();

    }
}
