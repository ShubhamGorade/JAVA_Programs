
package assignmenntno2;
import java.util.*;

/**
 *Write a program to compute sinx for given x. The user should supply x and a positive integer n.
 * We compute the sine of x using the series and the computation should use all terms in the series up through the term involving xn
sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......
 * @author SHUBHAM
 */
public class AssignmentNo24 {
     public static void main(String[] args)      

   {

       Scanner sc = new Scanner(System.in);    //Creating Scanner object
       System.out.print("Enter the value of x: ");
       double x = sc.nextDouble();             //User input for x
       int n=20;
       double Sum = 0;        //Creating and Initialising Sum to 0
       
       for(int i=0;i<n;i++)    //Setting a loop
       {

           Sum += (Math.pow(-1,i)*Math.pow(x,2*i+1))/factorial(2*i+1); //Adding the terms

       }
       System.out.println("sin(x) = "+Sum);    //Printing Sum   

   }
   static double factorial(int n) //Function to find factorial
   {
       double fact=1;

       for(int i=2;i<=n;i++)
       {
           fact = fact*i;      //Each integer till n is multiplied
       }
      return fact;        //Returning the factorial
   }
}


    

