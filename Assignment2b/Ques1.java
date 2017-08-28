/* ASSIGNMENT - 2b QUESTION-1

Problem Statement - Write a program that asks the user for a number n and gives him the possibility
to choose between computing the sum and computing the product of 1,...,n.

Idea - Learn how to use switch statement in Java.
*/
import java.util.Scanner;
public class Ques1{

	public static void computeSum(int N){  // Finding sum of all the elements of the array.
		int sum = 0 ;
		for ( int i = 1 ; i <= N ; i++){
			sum += i;
		}
		System.out.println("The total computed sum from 1 to N : " + sum);
	}
	public static void computeProduct(int N){  // Finding product of all the elements of the array.
		int product = 1;
		for ( int i = 1 ; i <= N ; i++){
			product *= i;
		}
		System.out.println("The total computed product from 1 to N: " + product);
	}




	public static void main(String [] args){
		System.out.println("Enter an integer N:");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		System.out.println("Enter 0 or 1 for computing the sum or product respectively:");
		int option = s.nextInt();
		switch(option){
			case 0 :
			computeSum(N);
			break;
			case 1:
			computeProduct(N);
			break;
			default:
			System.out.println("You entered an invalid character.");
		}
	}
}
