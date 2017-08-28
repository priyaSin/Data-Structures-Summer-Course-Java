/* ASSIGNMENT - 2b QUESTION-3

Problem Statement - Given a binary number convert it into decimal.

Idea - 111001(base2) = 1⋅2^5 + 1⋅2^4 + 1⋅2^3 + 0⋅2^2 + 0⋅2^1 + 1⋅2^0 = 5710
*/

import java.util.Scanner;
import java.lang.Math;
public class Ques3{

	public static int convertToDecimal(int binary){
		int i = 0;
		int sum = 0;
		while(binary > 0){
			int a = binary % 10;
			sum += Math.pow(2 , i) * a;
			i++;
			binary = binary/10;
		}
		return sum;
	}

	public static void main(String [] args){
		System.out.println("Enter a binary number for conversion to decimal:");
		Scanner s = new Scanner (System.in);
		int binary = s.nextInt();
		int decimal = convertToDecimal( binary );
		System.out.println("The decimal conversion of " + binary + " is " + decimal);
	}
}