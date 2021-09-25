
/* Pattern:

 *
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *
 *  *  *  *  *  *

*/

import java.util.Scanner;
public class RightTrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of lines:");
        n = scan.nextInt();
        System.out.println();
        for(int i=0; i<n;i++){           
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        scan.close();
    }
}