/* 

1)Arya Stark of Winterfell is very much interested in gardening and she decides to plant more trees 
in her garden. She plants trees in the order of rows and columns. She numbered the trees in column wise 
order. She planted the orange trees only in the second column from both first and last. But later when
the trees grew up, she forgot where she planted orange trees. So help her find out whether the given 
tree number is a number of orange trees or not. Display whether “It is an orange tree” or
“It is not an orange tree”.

INPUT FORMAT:

Input consists of 3 integers.

First input corresponds to the number of rows.

Second input corresponds to the number of columns.

Third input corresponds to the tree number.

SAMPLE INPUT:

5

5

20

SAMPLE OUTPUT:

It is an orange tree */

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        int rows = scan.nextInt();
        System.out.println("Enter the Number of Columns:");
        int column = scan.nextInt();
        System.out.println("Enter the Tree Number:");
        int treeNo = scan.nextInt();
        int counter = 1;
        int arr[][] = new int[rows][column];
        for(int i=0;i< rows;i++){    
            for(int j=0;j< column;j++){
                arr[j][i] = counter;
                counter++; 
            }
        }
        boolean flag = false;
        for(int i=0;i< rows;i++){    
            for(int j=0;j< column;j++){
                if(arr[i][2] == treeNo || arr[i][column-2]==treeNo){
                    flag = true;
                }
            }
        }
        if(flag = true){
            System.out.println("");
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < column; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        String result = (flag = true)?"This is orange an tree":"This is not a orange tree";
        System.out.println(result);
        scan.close();
    }
}
