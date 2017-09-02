/* ASSIGNMENT - 5 QUESTION - 2b 
Problem Statement - Return highest occurring character in the
String. IDEA - We will use a technique called ‘Hashing’. In this, when we traverse through the
string, we would hash each character into an array of ASCII characters.
Algorithm-
Input string = “test”
1: Construct character count array from the input string.
  count['e'] = 1
  count['s'] = 1
  count['t'] = 2

2: Return the index of maximum value in count array (returns ‘t’). 
Typically, ASCII characters are
256, so we use our Hash array size as 256. But if we know that our input string will have characters
with value from 0 to 127 only, we can limit Hash array size as 128. Similarly, based on extra info
known about input string, the Hash array size can be limited to 26.
*/
import java.util.Scanner;
public class Ques2b{

	public static char maxOccuringChar(String str){
		int [] count = new int [256];
		for(int i = 0 ; i < str.length() ; i++){
			count[str.charAt(i)]++;
		}
		//Finding the index of the maxCount
		int max = 0, index = 0;
		for(int i = 0 ; i < str.length() ; i++){
			if(count[str.charAt(i)] > max){
				max = count[i];
				index = i;
			}
		}
		return str.charAt(index) ;
	}

	public static void main(String [] args){
		System.out.println("Enter the String:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("The maximum occuring character is: " + maxOccuringChar(str));
	}
}
