/* ASSIGNMENT - 2 QUESTION-7(a)

Problem Statement - Write a program to generate the reverse of a given number.
(Have done this question in two ways, given in , 7(a) and 7(b))
*/
import java.util.Scanner;
public class Ques7a{

	public static String findReverse(int num){ // Returning a String as reverse of the number 
		String rev = "";                      // Initializing an empty string
		String str = Integer.toString(num);  // Converting to Integer to String 
		char arr [] = str.toCharArray();    // String to character array
		for (int i = arr.length-1 ; i >=0 ; i--){  // adding each character in the reverse order to "rev" String
			rev += arr[i];
		}
		return rev;
	}


	public static void main(String[] args){
		System.out.println("Enter the number to be reversed:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("The reverse of the number is given by : " + findReverse(num));
	}
}