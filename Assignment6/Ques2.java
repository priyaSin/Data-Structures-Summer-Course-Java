/* ASSIGNMENT - 6 QUESTION - 2
Problem Statement - Count number of zeros in an integer. Use Recursion.
*/
import java.util.Scanner;
public class Ques2{

	public static int numOfZeros( int a ){
		if( a/10 == 0 ){
			return 0;
		}
		else if( a/10 > 0 && a%10 == 0){

		return 1 + numOfZeros(a/10);	
		
		}
		return numOfZeros(a/10);
		
	}

	public static void main(String [] args){
		System.out.println("Enter an integer to count the number of zeros: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("The number of zeros in the integer : " + numOfZeros(a));
	}
}