
package assignmenntno2;
import java.util.*;
/**
 *Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
 * @author SHUBHAM
 */
public class AssignmentNo6 {
    
//function to find the power of a number  
static int power(int base, int exponent)  
{  
int power = 1;  
//increment the value of i after each iteration until the condition becomes false  
for (int i = 1; i <= exponent; i++)   
//calculates power  
power = power * base;  
//returns power  
 return power;  
}  
//driver code  
public static void main(String args[])  
{  
int base, exponent;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the base: ");  
base=sc.nextInt();  
System.out.print("Enter the exponent: ");  
exponent=sc.nextInt();  
//calling function  
int pow=power(base, exponent);  
//prints the result  
System.out.println(base +" to the power " +exponent + " is: "+pow);  
}  
}
   

