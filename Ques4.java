/* ASSIGNMENT - 1 QUESTION-4
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)

Problem Statement - Write pseudo code which tells whether the input integer number is an Armstrong number, or not.
 (153 is an Armstrong number because:153 = 13 + 53 + 33 )

Idea - An Armstrong number of three digits is an integer such that the sum of the cubes of its
digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 +1**3 = 371.
*/

import java.util.Scanner;
import java.lang.Math;
public class Ques4{

	public static Boolean ifArmstrong(int N){
		int sum = 0;
		int num = N;
		int digit = 0;
		while( num > 0){
		digit = num % 10;
		num = num / 10;
		sum += Math.pow(digit , 3 );
	}
	return sum == N;

	}
	public static void main(String [] args){
		System.out.println("Enter an integer to be checked:");
		Scanner s = new Scanner (System.in);
		int N = s.nextInt();
		System.out.println("Number is Armstrong: " + ifArmstrong(N));
	}
	
}