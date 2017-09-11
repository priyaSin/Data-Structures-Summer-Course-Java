/* ASSIGNMENT - 7 QUESTION - 5b (Another solution present)
Problem Statement - Given a string that
contains a single pair of parenthesis, compute recursively a new
string made of only of the parenthesis and their contents, so
"xyz(abc)12345" yields "(abc)".
*/
import java.util.Scanner;
public class Ques5b{

	public static String insideParen(String str){
		if(str.length() == 0 || str.length() == 1){
			return str;
		}
		if(str.charAt(0) == '('){
			if(str.charAt(str.length()-1) == ')'){
				return str;
			}
			return insideParen(str.substring(0 , str.length() -1));
		}
		return insideParen(str.substring(1 , str.length()));
	}


	public static void main(String [] args){
		System.out.println("Enter a string with a string inside parenthsis :");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("String inside the parenthesis : " + insideParen(str));

	}
}