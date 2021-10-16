import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");        
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();            
        }
        scan.close();
    }
}
