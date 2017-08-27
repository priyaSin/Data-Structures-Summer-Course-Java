/* ASSIGNMENT - 2 QUESTION-4

Problem Statement - Write a program to input a number and print the sum of all it’s even digits and
sum of all its odd digits separately.

*/
import java.util.Scanner;
public class Ques5{

	public static int [] oddEvenSum(int num){
		int oddSum = 0;
		int evenSum = 0;
		while(num > 0){
			int a = num % 10;
			num = num/10;
			if(a %2 ==0){
				evenSum += a;
			}
			else{
				oddSum += a;
			}
		}
		int sumArr [] = {evenSum , oddSum};
		return sumArr;
		
	}

	public static void main(String [] args){
		System.out.println("Input a number:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sumArr [] = oddEvenSum(num);
		System.out.println("The sum of even and odd digits of " + num + " is EvenSum = " + sumArr[0] + " and OddSum = " + sumArr[1]);
	}
}