/* ASSIGNMENT - 5 QUESTION - 7
Problem Statement - Given a string,find largest substring with no repetition 
i.e all unique characters. 
E.g - for string “abcdabceb” , answer will be “dabce”
IDEA - Simple but inefficient with time complexity of O(n^3)
Steps-
1. Find all the substrings of the given String
2. Finding the substring with all unique characters and hence finding the largest substring.
*/
import java.util.Scanner;
public class Ques7a{


	public static Boolean allUnique(String str){
		int [] arr = new int [256];
		char [] ch = str.toCharArray();
		for(int i = 0 ; i < ch.length ; i ++){
			arr[ch[i]]++;
			if(arr[ch[i]] > 1){
				return false;
			}
		}
		return true;
	}

	public static String largestSubstring(String str){
		int max = 0 , start = 0 , end = 0;
		for(int i = 0 ; i < str.length() ; i++){
			for(int j = i+1 ; j < str.length() ; j ++){
				if(allUnique(str.substring(i , j))){
					if(str.substring(i,j).length() > max){
						max = str.substring(i , j).length();
						start = i;
						end = j;
					}
				}
			}
		}
		return str.substring(start , end);
	}

	public static void main(String [] args){
		System.out.println("Enter a String:");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("The largest unique substring is : " + largestSubstring(str));
	}
}