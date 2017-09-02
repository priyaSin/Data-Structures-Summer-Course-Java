/*
ASSIGNMENT - 5 QUESTION - 2a 
Problem Statement - Return highest occurring character in the String.
IDEA - Making a character array of the string and also making a count arrary for maintaing the count
of each character of the array. Finding the index of the max count value of count array and printing
the corresponding character from the character array.
*/
import java.util.Scanner;
public class Ques2a{
	public static char maxOccuringChar(String str){
		char [] c = str.toCharArray();
		int [] count = new int [c.length];
		int total;
		for(int i = 0 ; i < c.length ; i++){
			total = 0;
			for( int j = 0 ; j < c.length ; j++){
				if(c[i] == c[j]){
					total++;
				}
			}
			count[i] = total;
		}
		// finding the maximum count and its index
		int max =0 , index = 0;
		for(int i = 0 ; i < count.length ; i++){
			if(count[i] > max){
				max = count[i];
				index = i;
			}
		}
		return c[index];
	}
	public static void main(String [] args){
		System.out.println("Enter the String:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("The maximum occuring character is: " + maxOccuringChar(str));
	}
}
