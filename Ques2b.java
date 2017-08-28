/* ASSIGNMENT - 2b QUESTION-5a
Problem Statement - Write a program to find square root of an input.
				a. Just find the integral part
				b. Find the square root with an accuracy of n decimal
				points, n is provided by the user.

*/
import java.util.Scanner;
import.lang.Math;
public class Ques2b {

	public static double findSquareRoot(int num , int n){
		int value = num;
		int noOfDigits = 0;
		while(value > 0){
			value = value / 10;
			noOfDigits++;
		}
		System.out.println("The number of digits in the number is " + noOfDigits + "\n" + "
			So the estimated number will be smallest number of half the number of digits than " + num);
		double x = Math.pow(10 , noOfDigits / 2);
		double x1 = num / x;
		for(int i = 1 ; i <= n ; i++ ){
		x = (x + x1)/2;
		x1 = num/x ;
		}
		return x;

	}

	public static void main(String [] args){
		System.out.println("Enter a number to find square root of:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Enter n, to find accuracy to n decimal points:");
		int n = s.nextInt();
		int sqRoot = findSquareRoot(num , n);
		System.out.println("The value of square root of " + num + " is " + sqRoot);
	}
}