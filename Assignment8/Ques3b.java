/* ASSIGNMENT - 8 QUESTION - 3b
Problem Statement - Given a String return all the subsequences.
a. Instead of returning print these i.e void printSubsequences
(String input,....).
For e.g. Input : “abc” Output : “”, a, b, c, ab, ac, bc, abc
Note - Uncomment the lines in code to understand more clearly how the recursion is working here.
This program considers all the letters to a string to be distinctive.
*/
import java.util.Scanner;
public class Ques3b{

	public static void printSub(String str , String outputSoFar){
		if(str.length() == 0 ){
			System.out.println(outputSoFar + " , ");
			return;
		}
		printSub(str.substring(1) , outputSoFar);
		printSub(str.substring(1) , outputSoFar + str.charAt(0) );
	}

	public static void main(String [] args){
		System.out.println("Enter a string : ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printSub(str , " ");
	}
}