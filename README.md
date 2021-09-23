# Java Programming

Java is a **programming language** and a **platform**. Java is a high level, robust, object-oriented and secure programming language. The repository consists of varying codes on *Core Java* working through basic to advanced problems covering all the concepts of *Object Oriented Programming*. 

## Running

To run a code from the set of codes provided, clone the repository first and run it in your local compiler. Another process involves to save the *file name* as the *public class name* of the code and copy the code accordingly to run and see the output and working.

A sample file name can be set as "Sum.java" for the following public class of the code.

```bash
public class Sum
```

## Sample Code on Sum

```java
import java.util.*; 
public class Main 
{ 
    public static void main(String args[]) 
    { 
        int x, y, sum;  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the first number: ");  
        x = sc.nextInt();  
        System.out.print("Enter the second number: ");  
        y = sc.nextInt();  
        sum = sum(x,y);  
        System.out.println("The sum of two numbers x and y is: " + sum);  
    } 
    public static int sum(int a, int b) 
    { 
        int sum = a + b;  
        return sum;  
    } 
}
```
## Sample Output for Sum

The output for the above snippet of code when run in a compiler shall look like
```bash
Enter the first number: 34
Enter the second number: 12
The sum of two numbers x and y is: 46
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
