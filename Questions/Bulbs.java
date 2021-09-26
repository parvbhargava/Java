/*

There are N bulbs that are initially off. In the first round, you turn ON all the bulbs, then you turn off every second bulb in the second round. On the third round, you toggle every third bulb (turning ON if it's OFF or vice-versa). For the Ith round, you toggle every Ith bulb. For the Nth round, you only toggle the last bulb.

Return the number of bulbs that are ON after the N rounds.

Example 1:

Input: 

3

Output: 

1

Explanation: 

At first, the status of the three bulbs is [OFF, OFF, OFF].

After the first round, the status of the three bulbs is [ON, ON, ON].

After the second round, the status of the three bulbs is [ON, OFF, ON].

After the third round, the status of the three bulbs is [ON, OFF, OFF]. 

So you should return 1, because there is only one bulb that is ON.
*/

import java.util.Scanner;

public class Bulbs{
    public static void main(String[] args) {
        System.out.println("Enter the number of Bulbs:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int counter = 0;
        boolean bulbs[] = new boolean[num];
        for(int i=0;i<num;i++){
            bulbs[i] = true;
        }
        for(int j=0;j<num;j++){
            if(j%2 != 0)
            bulbs[j]= false;
        }
        for(int k=1;k<num;k++){
            if(bulbs[k] == true){
                bulbs[k]  =false;
            }
            else{
                bulbs[k] = true;
            }
        }
        for(int k=1;k<num;k++){
            if(bulbs[k] == true){
                counter++;
            }
        }
        System.out.println("The number of bulbs ON are:"+"\n"+counter);
        scan.close();
    }
}