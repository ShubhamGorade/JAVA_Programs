
package assignmenntno2;
import java.util.*;

/**
 *Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number..
 * @author SHUBHAM
 */
public class AssignmentNo9 {
   public static void main(String[] args)
   {		
	int temp;
	boolean isPrime=true;
        int num;
       try (Scanner scan = new Scanner(System.in)) {
           System.out.println("Enter any number:");
           //capture the input in an integer
           num = scan.nextInt();
       }
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}
