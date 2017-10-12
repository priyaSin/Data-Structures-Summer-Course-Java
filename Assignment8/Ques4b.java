/* ASSIGNMENT - 8 QUESTION - 4b
Problem Statement -  Using the phone keypad, return all possible words that can be produced
given input digits. For e.g. 23 --> “ad, ae, af, bd, be, bf, cd, ce, cf”
a.  Instead of returning print all these
HERE PRINTING ALL THE STRINGS
*/
import java.util.Scanner;
public class Ques4b{
	public static void keypad(String num , String outputSoFar , String [] options){
		if(num.length() == 0){
			System.out.println(outputSoFar + " ");
			return;
		}
		String firstDigitOptions = options[num.charAt(0) - '0'];
		for( int i = 0 ; i < firstDigitOptions.length() ; i++){
			keypad(num.substring(1) , outputSoFar + firstDigitOptions.charAt(i) , options);
		}


	}
	public static void main(String args []){
		System.out.println("Enter a number :");
		Scanner s = new Scanner(System.in);
		String num = s.nextLine();
		String [] options = { "" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz" };
		keypad( num , "" ,  options);
	}
}