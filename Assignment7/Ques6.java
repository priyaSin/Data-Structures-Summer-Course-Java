/* ASSIGNMENT - 7 QUESTION - 6  
Problem Statement - Given a string,
return true if it is a nesting of zero or more pairs of parenthesis,
like "(())" or "((()))".
nestParen("(a+(b+c))") → true 
nestParen("((()))") → true 
nestParen("(((x))") → false
*/
import java.util.Scanner;
public class Ques6{

	public static boolean pairedNesting(String str){
		if((str.length() == 1 && (str.charAt(0) == '(' || str.charAt(0) == ')')) || str.charAt(0) == ')'){
			return false;
		}
		else if(str.length() == 0 || str.length() == 1){
			return true;
		}
		if(str.charAt(0) == '('){
			if(str.charAt(str.length()-1) == ')'){
				return true && pairedNesting(str.substring(1 , str.length()-1));
			}
			return pairedNesting(str.substring(0 , str.length()-1));
			}
			return pairedNesting(str.substring(1));
	}

	public static void main(String [] args){
		System.out.println("Enter a string: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(pairedNesting(str)){
		System.out.println("This string has paired nesting.");
		}
		else{
			System.out.println("This string does not have paired nesting.");
		}
	}
}