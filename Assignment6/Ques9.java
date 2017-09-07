/* ASSIGNMENT - 6 QUESTION - 9
Problem Statement - Write a recursive function to convert a String into the number it represents.
e.g. for input “1231” you should return integer 1231.
*/
import java.util.Scanner;
public class Ques9{

	public static int stringToNumber(String str){
		if(str.length() == 0){
			return 0;
		}
		if(str.length() == 1){
			return str.charAt(0)-48;
		}
		return (str.charAt(str.length()-1)-48)  + 10 * stringToNumber(str.substring(0 , str.length()-1));
	}

	public static void main(String [] args){
		System.out.println("Enter a string of numbers:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Given string represents number : " + stringToNumber(str));
	}
}