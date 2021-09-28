import java.util.Scanner;
public class QuestionFive
{  public static void main(String[] args)
        {
            Scanner scan=new Scanner(System.in);
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();
            int min=0, mid=0;
            if(a<b && a<c)
            {
                min=a;
                if(b>c)
                    mid=c;
                else
                    mid=b;
            }
            else if(b<a && b<c)
            {
                min=b;
                if(a>c)
                    mid=c;
                else
                    mid=a;
            }
            else
            {
                min=c;
                if(a>b)
                    mid=b;
                else
                    mid=a;
            }
            System.out.println("The treasure is in box which has number "+mid);
            int k=0;
            for(int i=1; i<=min; i++)
            {
                if(a%i==0 && b%i==0 && c%i==0)
                {
                    k=i;
                }
            }
            System.out.println("The code to open the box is "+k);
            scan.close();
        }
        
    }