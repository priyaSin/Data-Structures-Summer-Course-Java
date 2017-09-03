/* ASSIGNMENT - 5 QUESTION - 3
Problem Statement - Sort an array of Strings based on length.
*/
import java.util.Scanner;
public class Ques3{

	public static String sort(String str){
		String [] words = str.split(" ");
		int max ;
		int index = 0;
		String s = " ";
		for(int i = 0 ; i < words.length ; i++ ){
			max = Integer.MIN_VALUE; 
			for(int j = 0 ; j < words.length ; j ++){
				if(max < words[j].length() && words[j].length() != 0){
				index = j;
				max = words[j].length();
				}
			}
			s = words[index] + " " + s ;
			words[index] = "";
		}
		return s;

	}

	public static void main(String [] args){
		System.out.println("Enter a string:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("The sorted string:" + sort(str));
	}
}