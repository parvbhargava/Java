/*

Pattern:
      *
     **
    ***
   ****
  *****

*/
import java.util.Scanner;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of Lines:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0; i < num; i++){
            for(int j=0;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();           
        }
        scan.close();
    }
}
