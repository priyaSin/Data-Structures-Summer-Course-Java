/* ASSIGNMENT - 8 QUESTION - 3a
Problem Statement - Given a String return all the subsequences.
a. Instead of returning print these i.e void printSubsequences
(String input,....).
For e.g. Input : “abc” Output : “”, a, b, c, ab, ac, bc, abc
Note - Uncomment the lines in code to understand more clearly how the recursion is working here.
This program considers all the letters to a string to be distinctive.
*/
import java.util.Scanner;
public class Ques3a{
	public static void print(String [] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " , ");
		}
		System.out.println();
	}

	public static String [] findAllSub(String input){
		if(input.length() == 0){
			String [] output = {" "};
			return output;
		}

		String [] smallOutput = findAllSub(input.substring(1));
		System.out.println("Small Output : ");
		print(smallOutput);
		String [] output = new String [ 2  * smallOutput.length]; 
		// The output is twice the length as output is created by small Output +  adding one letter to each element of the small Output array
		//Copying the elements of the smallOutput to output
		for(int i = 0 ; i < smallOutput.length ; i++){
			output[i] = smallOutput[i];
		}
		// Adding the further elements , concatenating one letter to each element of smallOutput
		for(int i = 0 ; i < smallOutput.length ; i++){
			output[ i + smallOutput.length ] = input.charAt(0) + smallOutput[i];
		}
		System.out.println("Output array:");
		print(output);
		System.out.println("------------------------");
		return output;
	}


	public static void main(String [] args){
		System.out.println("Enter a string : ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String [] arr = findAllSub(str);
		System.out.println("All the subsequences of the string " + str + " are as follows : ");
		print(arr);
	}
}
