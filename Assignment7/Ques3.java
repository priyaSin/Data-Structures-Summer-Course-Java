/* ASSIGNMENT - 7 QUESTION - 3 
Problem Statement - Write a recursive
function – public String replace(String str, char ch1, char ch2) -
that changes all occurrences of ch1 in str to ch2. For example, if str
- "abcbad", and ch1 == 'a' and to == 'e', s would become "ebcbed".
*/
import java.util.Scanner;
public class Ques3{

	public static String replace(String str , char ch1 , char ch2){
		if(str.length() == 0 ){
			return str;
		}
		if(str.charAt(0) == ch1){
			return ch2+ replace(str.substring(1 , str.length()) , ch1 , ch2);
		}
		return str.charAt(0) + replace(str.substring(1 , str.length()) , ch1 , ch2);
	}

	public static void main(String [] args){
		System.out.println("Enter a string : ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Enter the character to be replaced and the character that it is to be replaced by:" );
		char ch1 = s.next().charAt(0);
		char ch2 = s.next().charAt(0);
		System.out.println("String after the replacement of characters: " + replace(str , ch1 , ch2));
	}
}
