/* ASSIGNMENT - 6 QUESTION - 1
Problem Statement - Multiply two numbers m & n using only addition & subtraction. Use Recursion.
*/
import java.util.Scanner;
public class Ques1{

	public static int mul(int m , int n){
		if(n == 1){
			return m;
		}
		else if(n == 0){
			return 0;
		}
		return m + mul(m , n-1 );
	}


	public static void main(String [] args){
		System.out.println("Enter the two numbers to multiply :");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println("The mulplication of " + m + " and " + n + " = " + mul(m , n));
	}
}