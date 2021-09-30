import java.util.Scanner;

public class UserNumEvenOddZeroCount{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,even=0,odd=0,zero=0;
        char yon;
        do{
            System.out.println("Please Enter The Number Here:");
            num = scan.nextInt();
            if(num == 0){
                zero++;
            }
            else if(num%2 == 0 ){
                even++;
            }
            else{
                odd++;
            }
            System.out.println("Do You wnat to enter the number again [Y/N]:");
            yon = scan.next().charAt(0);
            
        }
        while(yon == 'Y' || yon == 'y');
        System.out.println("Total Number of Even Numbers:" + even);
        System.out.println("Total Number of Odd Numbers:"+odd);
        System.out.println("Total Number of Zeros:"+ zero);
        scan.close();

    }
}