import java.util.Scanner;

public class LeapYear {
    public static boolean isleapyear(int year) {
        if(year%4==0 && year % 100!=0 || year%400==0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year = scan.nextInt();
        System.out.println((isleapyear(year))?year+" is leap year.":year+" is not a leap year.");
        scan.close();
    }
}