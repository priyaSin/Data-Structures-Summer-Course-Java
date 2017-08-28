/* ASSIGNMENT - 2 QUESTION-7(b)

Problem Statement - Write a program to generate the reverse of a given number.
(Have done this question in two ways, given in , 7(a) and 7(b))
*/
import java.util.Scanner;
public class Ques7b{
	public static int findReverse(int num){  // Returning integer as reverse of a number
		int sum = 0;
		while (num > 0){                    // Until becomes = 0
			int a = num % 10;               // Extracting the right most digit. 435%10 = 5
			sum = sum * 10 + a;             // Multiplying the sum by 10 and add the right most digit. 5 * 10 + 3 = 53.
			num = num / 10;                // removing the right most digit. 435 / 10 = 43
		}
		return sum;

	}
	public static void main(String [] args){
		System.out.println("Enter the number to be reversed:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("The reverse of the number is given by : " + findReverse(num));
	}
}