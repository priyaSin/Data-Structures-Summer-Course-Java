/* ASSIGNMENT - 2b QUESTION-4

Problem Statement - Given a decimal convert it into binary.

Idea - Conversion steps:
       1. Divide the number by 2.
       2. Get the integer quotient for the next iteration.
       3. Get the remainder for the hex digit.
       4. Repeat the steps until the quotient is equal to 0.

*/
import java.util.Scanner;
public class Ques4{

	public static int convertToBinary(int decimal){
		int remainder = 0;
		int quotient = 0;
		int sum = 0;
		Boolean flag = false;           // This is taken in order to check if the right most digits after conversion to binary is "0" or not.
		                                // For example for the case of 14, binary is = 1110
		while (decimal > 0){
			quotient = decimal / 2;
			remainder = decimal % 2;
			if(sum == 0 && remainder == 0){ // Following the case where last digit of binary comes out to be "0"
				sum = 10;
				flag = true;
			}
			else{
			sum = sum *10 + remainder;
			}
			decimal = quotient;
		}
		int rev = reverse(sum);            // Calculating reverse of the series of 0s and 1s obtained to produce the right binary number for the decimal number given
		if(flag == true ){                 // For removing the extra 1 that comes in the end because of the manipulation done when last digit of teh binary number is coming out to be "0"
			rev = rev /10;
		}
		return rev;
	}
	public static int reverse(int num){
		int sum = 0;
		while( num > 0){
			int a = num % 10;
			sum = sum * 10 + a;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String [] args){
		System.out.println("Enter an integer to convert to binary: ");
		Scanner s = new Scanner(System.in);
		int decimal = s.nextInt();
		int binary = convertToBinary(decimal);
		System.out.println("The binary conversion of " + decimal + " is " + binary);
	}
}
