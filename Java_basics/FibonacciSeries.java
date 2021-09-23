import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of terms in series");
        int n  ;
        n = scan.nextInt();
        int FirstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;
        System.out.print("The Fibonnachi Series till"+ n+ "term is:" +"\n"+FirstNumber +" "+secondNumber+" ");
        
        for(int i=3; i<=n;i++){
            thirdNumber = FirstNumber+secondNumber;
            System.out.print(thirdNumber+" ");
            FirstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        scan.close();
    }
}
