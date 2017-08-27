/* ASSIGNMENT - 1 QUESTION-2
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)

Problem Statement - Draw a flowchart to take two numbers and print their GCD.
*/
import java.util.Scanner;
// We are going to calculate GCD using Euclidien Algorithm.
/*
The Euclidean Algorithm for finding GCD(A,B) is as follows:
If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.  
If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.  
Write A in quotient remainder form (A = B⋅Q + R)
Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)
*/

public class Ques2{
	public static int GCD(int a , int b){
		if (a == 0 ){
			return b;
		}
		if(b == 0){
			return a;
		}
			return GCD(b , a%b);
		}
	public static void main(String [] args){
		System.out.println("Enter the two number to calculate GCD of:");
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int gcd = GCD(a , b);
		System.out.println("GCD of " + a + " and " +b + " is equal to " +gcd);
	}
}