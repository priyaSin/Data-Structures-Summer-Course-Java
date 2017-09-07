/* ASSIGNMENT - 6 QUESTION - 11 
Problem Statement - Given a string, compute recursively a new string where identical
chars that are adjacent in the original string are separated from each other by a "*".
Eg :
a) pairStar("hello") →"hel*lo"
b) pairStar("xxyy") → "x*xy*y"
c) pairStar("aaaa")→"a*a*a*a"
*/
import java.util.Scanner;
public class Ques11{

	public static String pairStar(String str){
		if(str.length() == 0 || str.length() == 1){
			return str;
		}
		if(str.charAt(0) == str.charAt(1)){
			return str.charAt(0) + "*" + pairStar(str.substring(1 , str.length()));
		}
		return str.charAt(0) + pairStar(str.substring(1 , str.length()));
	}


	public static void main(String [] args){
		System.out.println("Enter a String:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("New string : " + pairStar(str));
	}
}
