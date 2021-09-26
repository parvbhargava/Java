import java.util.Scanner;

/* Pattern:

        *  *  *  *  *  * 
        *  *  *  *  *  *
        *  *  *  *  *  *
        *  *  *  *  *  *
        *  *  *  *  *  *
        *  *  *  *  *  *

*/

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n = scan.nextInt();
        for(int i=0; i<n;i++){
            System.out.println();
           for(int j=0;j<n;j++){
               System.out.print(" * ");
           } 
        }
        scan.close();
    }
}
