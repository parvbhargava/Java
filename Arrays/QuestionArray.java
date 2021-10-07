/*
 *
 *  Take an array of length n where all the numbers are nonnegative and unique. Find the element in the 
 *  array possessing the highest value. Split the element into two parts where first part contains the next
 *  highest value in the array and second part hold the required additive entity to get the highest value.
 *  Print the array where the highest value get splitted into those two parts.
 *          Sample input: 4 8 6 3 2
 *          Sample output: 4 6 2 6 3 2 
 * 
 * */
import java.util.Arrays;
import java.util.Scanner;

public class QuestionArray {

    public static int highestNumber(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }
    public static int nextHighestNumber(int[] arr) {
        Arrays.sort(arr);
        int secondmax = arr[arr.length-2];
        return secondmax;
    }
    public static void logic(int[] arr , int max ,int nextmax) {
        int diff = max - nextmax;
        int finalarr [] = new int [arr.length+1];
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == max){
                flag = i;
            }
        }
        for(int i=0;i<flag;i++) finalarr[i] = arr[i];
        finalarr[flag] = nextmax;
        finalarr[flag+1] = diff;
        for(int i=flag+2;i<finalarr.length;i++) finalarr[i] = arr[i-1];
        System.out.println("The output is :");
        for(int i=0;i<finalarr.length;i++) System.out.print(finalarr[i] +" ");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Length of Array:");
        int n = scan.nextInt();
        System.out.println("Enter "+n+" elements for Array:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        int arrcopy[] = new int[n];
        for(int i=0;i<n;i++) arrcopy[i] = arr[i];
        int max = highestNumber(arr);
        int nextmax = nextHighestNumber(arr);
        logic(arrcopy, max, nextmax);
        scan.close();
    }
}