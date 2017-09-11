/* ASSIGNMENT - 7 QUESTION - 4 
Problem Statement - Take a String
input from user and return the String without the consecutive
duplicates.
For example, for input "aabccba" print "abcba". Use
Recursion.
*/
import java.util.Scanner;
public class Ques4{

	public static String removeDupli(String str){
		if(str.length() == 0 || str.length() == 1){
			return str;
		}
		if(str.charAt(0) == str.charAt(1)){
			return removeDupli(str.substring(1 , str.length()));
		}
		return str.charAt(0) + removeDupli(str.substring(1 , str.length()));
	}


	public static void main(String [] args){
		System.out.println("Enter a string with consecutive duplicates : " );
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("String with consecutive duplicates : " + removeDupli(str));
	}
}
