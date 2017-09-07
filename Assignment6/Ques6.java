/* ASSIGNMENT - 6 QUESTION - 6
Problem Statement - Use recursion to check if a given String is palindrome or not.
*/
import java.util.Scanner;
public class Ques6{

	public static Boolean checkPalindrome(String str){
		if(str.length() == 1 || str.length() == 0){
			return true;
		}
		if(str.charAt(0) == str.charAt(str.length() -1)){
			return checkPalindrome(str.substring(1 , str.length() -1));
		}
		return false;
	}

	public static void main(String [] args){
		System.out.println("Enter the string:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("The given string is a palindrome : " + checkPalindrome(str));
	}
}