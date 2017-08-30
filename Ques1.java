/* 
ASSIGNMENT - 3 QUESTION-1 
Problem Statement - Convert a decimal number to binary using array.
*/

import java.util.Scanner;
public class Ques1{
	public static void getBinary(int num){
		int remainder = 0;
		int quotient = 0;
		int bin [] = new int [100];
		int count = 0;
		while(num != 0){
			bin[count] = num %2;
			num = num/2;
			count++;
		}
		// Resetting count (decreased by 1) due to the last iteration
		count--;
		System.out.println("The binary equivalent of the decimal number = ");
		while(count >= 0){
			System.out.print(bin[count]);
			count--;
		}
	}
	public static void main(String [] args){
		System.out.println("Enter a decimal number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		getBinary(num);
	}
}