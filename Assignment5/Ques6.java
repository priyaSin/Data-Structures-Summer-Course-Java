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
			if(arr[i] == arr[i+1] && i != arr.length-1){
				count++;
			}
			else if(arr[i] != arr[i+1] && count ==1){
				compress = compress + arr[i+1] ;
			}
			else if(i == arr.length-1 && count == 1){
					compress = compress + arr[i];
				}
			else{
				compress = compress + arr[i+1] + count ;
				count = 1;
			}
			System.out.println(compress);
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