/* ASSIGNMENT - 6 QUESTION - 10
Problem Statement - Given two Strings check if one is reverse of the other.
*/
import java.util.Scanner;
public class Ques10{

	public static Boolean checkReverse(String str1 , String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		if(str1.length() == 0 && str2.length() == 0){
			return true;
		}
		if(str1.charAt(0) == str2.charAt(str2.length()-1)){
			return checkReverse(str1.substring(1 , str1.length()) , str2.substring(0,str2.length()-1));
		}
		return false;
	}

	public static void main(String [] args){
		System.out.println("Enter the first string: ");
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		System.out.println("Enter the second string: ");
		String str2 = s.nextLine();
		if(checkReverse(str1 , str2)){
			System.out.println("The two strings are reverse of each other.");
		}
		else{
			System.out.println("The two strings are not reverse of each other.");
		}
	}
}