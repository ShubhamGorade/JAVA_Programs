
package assignmenntno2;
import java.util.*;

/**
 *Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
 * @author SHUBHAM
 */
public class AssignmentNo7 {
    public static void main(String[] args)
    {
    int num , reversed = 0;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter Any Number: ");
    num=sc.nextInt();
    
    System.out.println("Original Number: " + num);

    // run loop until num becomes 0
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}
