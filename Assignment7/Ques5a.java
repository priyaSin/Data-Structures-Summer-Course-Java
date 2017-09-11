/* ASSIGNMENT - 7 QUESTION - 5a (Another solution present)
Problem Statement - Given a string that
contains a single pair of parenthesis, compute recursively a new
string made of only of the parenthesis and their contents, so
"xyz(abc)12345" yields "(abc)".
*/
import java.util.Scanner;
public class Ques5a{

	public static String insideParen(String str , Boolean flag){
		if( str.charAt(0) == ')'){
			return "" + ')';
		}
		if(str.charAt(0) == '('){
			flag = true;
			return "(" + insideParen(str.substring(1 , str.length()) , flag);

		}
		if(flag == true){
		return str.charAt(0) + insideParen(str.substring(1 , str.length()) , flag);
		}
		return insideParen(str.substring(1 , str.length()) , flag);
	}

	public static void main(String [] args){
		System.out.println("Enter a string with a string inside parenthesis: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("String inside parenthsis:" + insideParen(str , false));
	}
}
