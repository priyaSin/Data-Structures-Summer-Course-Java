/* ASSIGNMENT - 2 QUESTION-7(b)

Problem Statement - Write a program to generate the reverse of a given number.
(Have done this question in two ways, given in , 7(a) and 7(b))
*/
import java.util.Scanner;
public class Ques7b{
	public static int findReverse(int num){
		int sum = 0;
		while (num > 0){
			int a = num % 10;
			sum = sum * 10 + a;
			num = num / 10;
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