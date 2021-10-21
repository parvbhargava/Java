import java.util.Scanner;

public class QuestionSix {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int day[] = new int [7];
       int salary = 0;
       for(int i=0 ;i < day.length ; i++){
           day[i] = scan.nextInt();
       }
       for(int i=0;i < day.length ;i++){
            if(i==0){

                salary += 100*day[i];
                salary +=  salary*50/100;
                
            }
       }
        //System.out.println(salary);
       scan.close();
   }
}