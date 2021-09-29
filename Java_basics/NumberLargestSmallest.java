import java.util.Scanner;

public class NumberLargestSmallest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE;
        char yon;
        do{
            System.out.println("Enter The Number:");
            num = scan.nextInt();
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
            System.out.println("Do you want to enter another number[Y/N]");
            yon = scan.next().charAt(0);
        }
        while(yon == 'Y' || yon == 'y');
        System.out.println("The Maximum number is:" + max);
        System.out.println("The Minimum number is:" + min);

        scan.close();
    }
}