
package assignmenntno2;

/**
 *Java Program to print different Patterns..
 * @author SHUBHAM
 */
public class AssignmentNo20 { 
  public static void main(String[] args) {
int rows=4;  
 for (int i = 1; i <= rows; i++)   
{  
for (int j = 1; j <= 10-i; j++)  
{  
System.out.print("*");  
}  
for (int j = 1; j <= i; j++)  
{  
System.out.print("*");  
}  
System.out.println();  
}  
}
}  

