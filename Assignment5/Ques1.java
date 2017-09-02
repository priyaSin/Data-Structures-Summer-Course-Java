/* ASSIGNMENT - 5 QUESTION- 1   
Problem Statement - Take a String input from user and return a
String that does not contain consecutive duplicates. For example, for input "aabccbaa" return
"abcba" .
*/
import java.util.Scanner;
public class Ques1{

	public static String removeDuplicates( String str){
		String s = "";
		char [] ch = str.toCharArray();
		for(int i = 0 ; i < ch.length-1 ; i++){
			if(ch[i] == ch[i+1]){
				ch[i] = '\0';
			}
		}
		for(int i = 0 ; i < ch.length ; i++){
			if(ch[i] != '\0'){
				s += ch[i];
			}
		}
		return s;
	}

	public static void main(String [] args){
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("String without duplicates: " + removeDuplicates(str));
	}
}
