/* ASSIGNMENT - 6 QUESTION - 7a
Problem Statement - Given a string,compute recursively (no loops) a new string where all
appearances of “pi” have been replaced by “3.14”. 
Eg :
change Pi("xpix") → "x3.14x" 
change Pi("pipi") → "3.143.14" 
change Pi("pip") → "3.14p"
IDEA - In this part it has been done using loops.
*/
import java.util.Scanner;
public class Ques7a{

	public static String replaceString(String str){
		String newString = "";
		for(int i = 0 ; i < str.length(); i++){
			if(str.charAt(i) == 'p' && str.charAt(i+1) == 'i'){
				newString += "3.14";
				i++;
			}
			else{
				newString += str.charAt(i);
			}
		}
		return newString;
	}

	public static void main(String [] args){
		System.out.println("Enter a string:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("New String : " + replaceString(str));
	}
}
