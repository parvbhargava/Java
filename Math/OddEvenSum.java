import java.util.Scanner;
public class OddEvenSum {
    public static void main(String[] args) {
        System.out.println("Enter the number of intergs you wish to Enter:");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int []num = new int[n];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++){
            num[i] = scan.nextInt();
        }
        int even = 0 ,odd=0; 
        for(int j=0; j<n;j++){
            if(num[j]%2 ==0){
                even+=num[j];
            }
            else{
                odd+=num[j];
            }    
        }
        System.out.println("The Sum of even numbers:"+even);
        System.out.println("The Sum of even numbers:"+odd);
        scan.close();
    }
}
