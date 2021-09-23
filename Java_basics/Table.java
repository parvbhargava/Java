import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows =scan.nextInt();
        System.out.println("Enter the number of Columns");
        int columns = scan.nextInt();
        int totalNumberOfElements= rows*columns;
        System.out.println("Enter"+ " "+totalNumberOfElements+" "+"Elements:");
        int [][]inputarray = new int[rows][columns];
        // Scanning the elements.
        for(int i=0;i< rows;i++){
            for(int k=0;k< columns;k++){
                inputarray[i][k]= scan.nextInt();
            }
        }
        scan.close();
        // Printing the elements
        System.out.println("The Input array is :");
        for(int i=0;i< rows;i++){
            for(int k=0;k< columns;k++){
                System.out.print(inputarray[i][k] + "\t");
            }
            System.out.println();
        }
    }
}