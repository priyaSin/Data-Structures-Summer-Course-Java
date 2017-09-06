/* ASSIGNMENT - 5 QUESTION - 7b
Problem Statement - Given a string,find largest substring with no repetition 
i.e all unique characters. 
E.g - for string “abcdabceb” , answer will be “dabce”
IDEA -
*/
import java.util.Scanner;
public class Ques7b{
	public static String uniqueSubstring(String str){
		int n = str.length();
		int start = 0 , end = 1;
		int current_len = 1 , max_len = 1;
		int prev_index;
		int [] lastIndex = new int [256];
		for(int i = 0 ; i < lastIndex.length ; i++){
			lastIndex[i] = -1;
		}

		lastIndex[str.charAt(0)] = 0;

		for(int i = 1 ; i < n ; i++){
			prev_index = lastIndex[str.charAt(i)];

			if(prev_index == -1 || i - current_len > prev_index){
				current_len ++;
				end = i+1;
			}
			else{
				if(current_len >= max_len){
					max_len = current_len;
					if(start == prev_index){
					start = prev_index +1 ;
					}
					end = i+1;
				}
				current_len = i - prev_index;

			}
			lastIndex[str.charAt(i)] = i;
		}
		if(current_len > max_len){
			end = n+1;
		}
		return str.substring(start , end);
	}
	public static void main(String [] args){
		System.out.println("Enter a String to find largest unique substring:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("The Largest unique substring is : " + uniqueSubstring(str));
	}
}