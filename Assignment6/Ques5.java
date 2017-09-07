/* ASSIGNMENT - 6 QUESTION - 5
Problem Statement - Given k find the geometric Sum i.e. 1 + 1/2 + 1/4 + 1/8 + ...+ 1/(2^k)
*/
import java.util.Scanner;
import java.lang.Math;
public class Ques5{

	public static double geoSum( int k ){
		if( k <= 0 ){
			return 1;
		}
		return 1/Math.pow(2 , k) + geoSum(k-1);
	}


	public static void main (String [] args){
		System.out.println("Enter the value of k");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		System.out.println("The value of the geometric sum : " + geoSum(k));
	}
}