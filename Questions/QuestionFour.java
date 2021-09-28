/*
Lab Allocation - IIThere are 3 labs in the Chemical department(L1, L2, and L3) with a seating capacity 
of x, y, and z respectively.One of the 3 labs has been allocated for FACE training.Out of the available
labs(after allocating one to FACE training), write a program to find the lab which has minimal seating 
capacity.

INPUT FORMAT:
Input consists of 3 integers and a string.
The first input is an integer which denotes the seating capacity of L1(x).
The second input is an integer which denotes the seating capacity of L2(y).
The third input is an integer which denotes the seating capacity of L3(z).
The fourth input is a string which denotes the lab which is allocated for FACE training.

OUTPUT FORMAT:
Print the minimal seating capacity lab among the available labs.
Refer the sample output for formatting.

SAMPLE INPUT:
30
40
20
L3

SAMPLE OUTPUT:
L1 */

import java.util.Scanner;

public class QuestionFour {
    
    public static int compare(int x , int y) {
        int result = (x<y) ? x:y;
        return result;
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter capacity for Lab 1");
        int l1 = scan.nextInt();
        System.out.println("Enter capacity for Lab 2");
        int l2 = scan.nextInt();
        System.out.println("Enter capacity for Lab 3");
        int l3 = scan.nextInt();
        System.out.println("Enter Lab name which is occupied");
        scan.nextLine();
        String allocatedLab = scan.nextLine();  
        switch (allocatedLab) {
            case "Lab 1":
            String result1 = (l2<l3) ? "Lab 2":"Lab 3";
            System.out.println(result1 + " : "+ compare(l2,l3));    
                break;
            case "Lab 2":
            String result2 = (l1<l3) ? "Lab 1":"Lab 3";
            System.out.println(result2 + " : "+ compare(l1, l3));    
                break;
            case "Lab 3":
            String result3 = (l1<l2) ? "Lab 1":"Lab 2";
            System.out.println(result3 +" : "+ compare(l1, l2));
                break;    
            default:
                System.out.println("Please Enter an Valid Input");
                break;
        }
        scan.close();

    }
}
