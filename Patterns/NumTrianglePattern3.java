/*
Pattern:

     1
    212
   32123
  4321234
 543212345

 */
import java.util.*;
public class NumTrianglePattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Lines:");
        int num = scan.nextInt();
        int counter = 1;
        for(int i=0; i<num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print(counter-k);
            }
            for( int l=0;l<=i;l++)
            {
                System.out.print(l+1);
            }
            counter++;
            System.out.println();
        }
        scan.close();
    }

}

