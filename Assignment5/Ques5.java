/* ASSIGNMENT - 5 QUESTION - 5
Problem Statement - Reverse String wordwise.
Eg “Welcome to Coding Ninjas”
reversed is–
“Ninjas Coding to Welcome”
*/
import java.util.Scanner;
public class Ques5{

	public static String reverseWordWise(String str){
		String [] words = str.split(" ");
		String reverse = "";
		for(int i = 0 ; i < words.length ; i++){
			reverse = words[i] + " " + reverse;
		}
		return reverse;
	}


	public static void main(String [] args){
		System.out.println("Enter a string:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("String after string reversal: " + reverseWordWise(str));
	}
}