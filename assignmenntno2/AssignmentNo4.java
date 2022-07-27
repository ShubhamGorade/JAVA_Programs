
package assignmenntno2;
import java.util.Scanner;


/**
 *Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number...
 * @author SHUBHAM
 */
public class AssignmentNo4 {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=s.nextInt();
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
    

