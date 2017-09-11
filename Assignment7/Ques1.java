/* ASSIGNMENT - 7 QUESTION - 1
Problem Statement - Find GCD of two numbers recursively.
*/
import java.util.Scanner;
public class Ques1{

	public static int GCD(int a , int b){
		if( a%b == 0){
			return b;
		}
		return GCD(b , a%b);
	}

	public static void main(String [] args){
		System.out.println("Enter the two number to find GCD of:");
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(a < b){
			int temp = a; 
			a = b ; 
			b = temp;
		}
		int c = GCD(a , b);
		System.out.println("The GCD of " + a + " and " + b + " is " + c);
	}
}