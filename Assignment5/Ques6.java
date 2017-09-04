/* ASSIGNMENT - 5 QUESTION - 6
Problem Statement - Write code to do basic string compression.
e.g.Given - aaabbccds 
print out - a3b2c2ds.
*/
import java.util.Scanner;
public class Ques6{

	public static String compressString(String str){
		char [] arr = str.toCharArray();
		String compress = "";
		int count = 1;
		for(int i = 0 ; i < arr.length ; i++){
			count = 1;
			compress += arr[i];	
			while(i+1 < arr.length && arr[i] == arr[i+1]){
				count++;
				i++;
			}
			if(count != 1){
			compress += count;
			}
		}
		return compress;
	}

	public static void main(String [] args){
		System.out.println("Enter a string to compress: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Compressed String:" + compressString(str));
	}
}