/**
 * write a C++program to check whether the given character is a vowel or consonant.
 */

import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char letter = scan.next().charAt(0);
        switch (letter) {
            case 'a':
            System.out.println("This is a vowel");    
                break;
            case 'A':
            System.out.println("This is a vowel");    
                break;
            case 'e':
            System.out.println("This is a vowel");                   
                break;
            case 'E':
            System.out.println("This is a vowel");
                break;
            case 'i':
            System.out.println("This is a vowel");
                break;
            case 'I':
            System.out.println("This is a vowel");
                break;
            case 'o':
            System.out.println("This is a vowel");
                break;
            case 'O':
            System.out.println("This is a vowel");
                break;
            case 'u':
            System.out.println("This is a vowel");
                break;
            case 'U':
            System.out.println("This is a vowel");
                break;
            default:
            System.out.println("This is a Consonant");
                break;
        }
        scan.close();
    }
}
