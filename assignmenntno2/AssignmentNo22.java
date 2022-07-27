
package assignmenntno2;
import java.util.*;
/**
 *Java program to print Patterns..
 * @author SHUBHAM
 */
public class AssignmentNo22 {
    public static void main(String[] args)   
{  
int row, i, j, space ;  
System.out.print("Enter the number of rows you want to print: ");  
Scanner sc = new Scanner(System.in);  
row = sc.nextInt();  
space = row - 1;  
for (j = 1; j<= row; j++)  
{  
for (i = 1; i<= space; i++)  
{  
System.out.print("  ");  
}  
space--;  
for (i = 1; i <= 2 * j - 1; i++)  
{  
System.out.print(j);  
}  
System.out.println("");  
}
}
}

