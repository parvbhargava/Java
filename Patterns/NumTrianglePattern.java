
/*
Pattern:

       1
      2 2
     3 3 3
    4 4 4 4
   5 5 5 5 5

*/
import java.util.*;

public class NumTrianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        int num = scan.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<= i;k++){
                System.out.print(" "+counter);
            }
            counter++;
            System.out.println();
        }
        scan.close();
    }
}
