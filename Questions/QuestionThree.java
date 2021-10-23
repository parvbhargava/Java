/**
 * 
Age Detector

Eustace Scrubb and Prince Caspian were discussing about the differences between England and the magical 
world Narnia. Eustace was boasting that the English people are really good at Mathematics and he can 
able to tell anyone's age in a one second if he just knows the current year(only the last two digits)
 and the year they were born(only the last two digits). Prince Caspian challenged him and told that if 
he succeeds , he will be named as King of Lone Islands, Narnia.Can You help Eustace by writing a java
 program to find the current age in years?

INPUT FORMAT:

Input consists of 2 integers.

The first integer corresponds to the last 2 digits of the birth year.

The second integer corresponds to the last 2 digits of the current year.

OUTPUT FORMAT:

Print the current age.

Refer below sample output for formatting.

SAMPLE INPUT:

62

00

SAMPLE OUTPUT:

38 

*/

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter last two digit of birth year:");
        int birthYear = scan.nextInt();
        System.out.println("Enter last two digit of current year:");
        int currentYear = scan.nextInt();
        int result = Math.abs(currentYear - birthYear);
        System.out.println("The age is: " + result);
        scan.close();
    }
}
