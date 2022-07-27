
package assignmenntno2;
import java.util.*;

/**
 *Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
 * @author SHUBHAM
 */
public class AssignmentNo8 {
     public static void main(String[] args)
    {
        Scanner keyboard= new Scanner(System.in);

        int counter;
        int i;
        int num;
        int sumOdd= 0;
        int sumEven= 0;

        System.out.println("Enter integers other then Zero: ");
        num=keyboard.nextInt();

        System.out.println("The numbers you entered are: ");

         for (i =num; i !=0; i++)
                {
                    if (i % 2 == 0)
                        sumEven = sumEven + i;
                    else
                        sumOdd = sumOdd + i;
                    i = keyboard.nextInt();
                }
        System.out.println("Even sum: " + sumEven);
        System.out.println("Odd sum: " + sumOdd);
    }
}
    
    
