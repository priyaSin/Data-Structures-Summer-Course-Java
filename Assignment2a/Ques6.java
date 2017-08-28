/* ASSIGNMENT - 2 QUESTION-6

Problem Statement - Write a program to find x^n. Take x and n from the user.
Idea - Using recursion 
*/
import java.util.Scanner;
public class Ques6{
	public static int power(int x , int n) {
		if(x == 1 || n == 0){     // For the cases of (1)^n = 1 and (x)^0 = 1
			return 1;
		}
		return x * power(x , n-1);
	}
	public static void main(String [] args){
		System.out.println("Enter the value of x and n :");
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		System.out.println("The value of x to the power n = "+ power(x , n));
	}
}