/* ASSIGNMENT - 2 QUESTION-2

Problem Statement - Write a program to determine whether the entered character is in upper case or
lower case, or is an invalid character.

*/
import java.util.Scanner;
public class Ques2{
	public static void main(String [] args){
		System.out.println("Enter a character :");
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);       // Scanner class supports no nextChar()

		if (ch >= 'A' && ch <= 'Z'){
			System.out.println("Entered Character is upper case.");
		}
		else if ( ch >= 'a' && ch <= 'z'){
			System.out.println("Entered Character is lower case.");
		}
		else{
			System.out.println("Entered character is an invalid character.");
		}

	}
}
