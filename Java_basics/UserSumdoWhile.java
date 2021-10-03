import java.util.Scanner;
public class UserSumdoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 , num2 , sum =0;
        char yon;
        do{
            System.out.println("Enter two numbers:");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            sum = num1 + num2;
            System.out.println(sum);
            System.out.println("Wanna do it again [Y/N]");
            yon = scan.next().charAt(0);

        }
        while( yon == 'Y' || yon == 'y' );
        
        scan.close();

        
    }
}
