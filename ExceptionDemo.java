
package exceptiondemo.java;
import java.util.Scanner;

public class ExceptionDemoJava {

   
    public static void main(String[] args) {
        int a,b,c;
        
     Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 2 number");
        a=sc.nextInt();
        b=sc.nextInt();
        
        try
        {
            c=a/b;
            System.out.println("Division is" +c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be zero, try again");
        }
        System.out.println("bye");
            
        }
       
    }
    

