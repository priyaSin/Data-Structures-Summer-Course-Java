/* ASSIGNMENT - 5 QUESTION - 4
Problem Statement - Reverse each word of a String. Eg “Welcome to Coding Ninjas”
reversed is – “emocleW ot gnidoC sajniN”
*/
import java.util.Scanner;
public class Ques4{

	public static String reverseEachWord(String s){
		String [] words = s.split(" ");
		String str = " ";
		for(int i = 0 ; i < words.length ; i ++){
			str += reverse(words[i]) + " " ;
		}
		return str;
	}

	public static String reverse(String word){
			char [] letters = word.toCharArray();
			String reverseWord = "";
			for(int i = 0 ; i < letters.length ; i++){
				reverseWord = letters[i] + reverseWord;
			}
			return reverseWord;
	}



	public static void main(String [] args){
		System.out.println("Enter a string:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("String after reversal of each word:" + reverseEachWord(str));
	}
}