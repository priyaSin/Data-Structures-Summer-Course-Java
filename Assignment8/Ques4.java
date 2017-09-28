/* ASSIGNMENT - 8 QUESTION - 4
Problem Statement -  Using the phone keypad, return all possible words that can be produced
given input digits. For e.g. 23 --> “ad, ae, af, bd, be, bf, cd, ce, cf”
a.  Instead of returning print all these
*/
import java.util.Scanner;
public class Ques4{

	public static String [] keypad( int n , String [] options){
		if(n == 0){
			String [] output = {""};
			return output;
		}
		int lastDigit = n % 10;
		String lastDigitOptions = options[lastDigit];
		String [] smallOutput = keypad( n / 10 , options);
		String [] output = new String [smallOutput.length * lastDigitOptions.length()];

		int k = 0 ; 
		for(int i = 0 ; i < smallOutput.length ; i++){
			for(int j = 0 ; j < lastDigitOptions.length() ; j++){
				output[k] = smallOutput[i] + lastDigitOptions.charAt(j);
				k++;
			}
			
		}
		return output;
	}

	public static void printArray(String [] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String args []){
		System.out.println("Input any number:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String [] options = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
		String [] output = keypad( n , options); 
		printArray(output);
	}
}
