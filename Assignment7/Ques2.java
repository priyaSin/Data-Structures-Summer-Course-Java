/* ASSIGNMENT - 7 QUESTION - 2
Problem Statement - Reverse a string
*/
import java.util.Scanner;
public class Ques2{

	public static String reverse(String str){
		if(str.length() == 0 || str.length() == 1){
			return str;
		}
		return str.charAt(str.length()-1) + reverse(str.substring(0 , str.length()-1));
	}

	public static void main(String [] args){
		System.out.println("Enter a string :");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Reverse of the given string: " + reverse(str));
	}
}