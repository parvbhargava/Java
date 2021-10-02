/*
Pattern:

      1
     222
    33333
   4444444
  555555555

*/
import java.util.*;
public class NumTrianglePattern2 {
    public static void main(String[] args) {
        System.out.println("Enter the number of Lines:");
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        int num = scan.nextInt();
        for(int i=0; i<num;i++){
            for(int j=0;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k< 2*i+1;k++){
                System.out.print(counter);
            }
            counter++;
            System.out.println();
        }
        scan.close();
    }
}
