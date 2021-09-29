import java.util.Scanner;

public class BinaryConsecutiveNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scan.nextInt();
        int counter = 0;
        String bin = Integer.toBinaryString(n);
        int max=0;
        for(int i=0;i<bin.length();i++){
            counter = (bin.charAt(i) == '1')?counter+1:0;
            if(max<counter)
                max=counter;
        }
        System.out.println(max);
        scan.close();
    }
}