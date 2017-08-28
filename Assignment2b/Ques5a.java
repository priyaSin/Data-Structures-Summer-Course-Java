/* ASSIGNMENT - 2b QUESTION-5a

Problem Statement - Write a program to find square root of an input.
				a. Just find the integral part
				b. Find the square root with an accuracy of n decimal
				points, n is provided by the user.
IDEA - Idea is to use Babylion method in both the cases.

*/

import java.util.Scanner;
public class Ques5a{
	public static int findSquareRoot(int num ){
		//Taking a estimate of the rootRoot
		int value = num;
		int noOfDigits = 0;
		while(value > 0){
			value = value / 10;
			noOfDigits++;
		}
		System.out.println("The number of digits in the number is " + noOfDigits + "\n" 
			+ "So the estimated number will be smallest number of half the number of digits than " + num);
		// Estimate value (x) and num/x
		double x = Math.pow(10 , noOfDigits / 2);
		double x1 = num / x;

		for(int i = 1 ; i <= 10 ; i++ ){
		// new x is arithematic mean of x and x1 and accordingly x1 is modified
		x = (x + x1)/2;
		x1 = num/x ;
		}
		return (int) x ;

	}
	public static void main(String [] args){
		System.out.println("Enter a number to find square root:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sqRoot = findSquareRoot(num );
		System.out.println("The value of square root of " + num + " is  " + sqRoot);

	}
}