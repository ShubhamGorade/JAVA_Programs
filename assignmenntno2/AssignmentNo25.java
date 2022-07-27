
package assignmenntno2;
/**
 *Write a program to compute the cosine of x. The user should supply x and a positive integer n.
 * We compute the cosine of x using the series and the computation should use all terms in the series up through the term involving xn
cos x = 1 - x2/2! + x4/4! - x6/6! .....
 * @author SHUBHAM
 */
public class AssignmentNo25 {
    // Java program to find
// the sum of cos(x) series
	static final double PI = 3.142;
	
	static double cosXSeriesSum(double x,int n)
	{
		// here x is in degree.
		// we have to convert it to radian
		// for using it with series formula,
		// as in series expansion angle is in radian
	
		x = x * (PI / 180.0);
	
		double res = 1;
		double sign = 1, fact = 1,pow = 1;
		for (int i = 1; i < 5; i++)
		{
			sign = sign * -1;
			fact = fact * (2 * i - 1) *(2 * i);
			pow = pow * x * x;
			res = res + sign * pow / fact;
		}
	
		return res;
	}
	
	// Driver Code
	public static void main(String[] args)
	{
		float x = 50;
		int n = 5;
		System.out.println((float)(
			cosXSeriesSum(x, 5) * 1000000) /1000000.00);
	}
}



    

