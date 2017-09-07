/* ASSIGNMENT - 6 QUESTION - 3
Problem Statement - Write a function that returns the sum of the digits of an integer.
*/
import java.util.Scanner;
public class Ques3{

	public static int sum( int a ){
		if( a/10 == 0 ){
			return a % 10;
		}
		return a%10 + sum(a/10);
	}

	public static void main(String [] args){
		System.out.println("Enter an integer : ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("The sum of all the digits of an integer: " + sum(a));
	}
}
