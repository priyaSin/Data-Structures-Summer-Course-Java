/* ASSIGNMENT - 6 QUESTION - 8 
Problem Statement - Given a string,compute recursively a new string
where all the 'x' chars have been removed.

Eg :
a. noX("xaxb")→"ab" 
b. noX("abc")→"abc"
	noX("xx") → ""
*/
import java.util.Scanner;
public class Ques8{

	public static String removeX(String str){
		if(str.length() ==0 ){
			return str;
		}
		if(str.charAt(0) == 'x'){
			return removeX(str.substring(1 , str.length()));
		}
		return str.charAt(0)+removeX(str.substring(1 , str.length()));
	}

	public static void main(String [] args){
		System.out.println("Enter a string:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("New String aftre removal of 'x' : " + removeX(str));
	}
}