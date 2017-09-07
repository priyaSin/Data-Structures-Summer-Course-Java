/* ASSIGNMENT - 6 QUESTION - 7b
Problem Statement - Given a string,compute recursively (no loops) a new string where all
appearances of “pi” have been replaced by “3.14”. 
Eg :
change Pi("xpix") → "x3.14x" 
change Pi("pipi") → "3.143.14" 
change Pi("pip") → "3.14p"
IDEA - In this part it has been done using recursion.
*/
import java.util.Scanner;
public class Ques7b{

	public static String replaceString(String str){
		if(str.length() == 1 || str.length() == 0){
			return str;
		}
		if(str.substring(0,2).equals("pi")){ 
		// == is used to compare if both are same object and .equals() is used to comapre actual value of the two strings
			return "3.14" + replaceString(str.substring(2,str.length()));
		}
		return str.charAt(0) + replaceString(str.substring(1,str.length()));
	}

	public static void main(String [] args){
		System.out.println("Enter a string: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("New String: " + replaceString(str));
	}
}