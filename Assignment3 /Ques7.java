/* 
ASSIGNMENT - 3 QUESTION-7
Problem Statement - In an array that contains duplicates, find the first non
repeating element.
E.g – input – [5,2,6,7,5,6,9] and output - 2
(Assuming in case where no non-repeating element present -1 is returned)
*/
import java.util.Scanner;
public class Ques7{
	public static int nonRepeating(int [] arr){
		int nonRepeat = 0;
		for(int i = 0 ; i < arr.length-1 ; i++){
			nonRepeat = arr[i];
			for( int j = i+1 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){ //As soon as find the element to be repeating we exit out of the loop
					break;
				}
				if(j == arr.length -1 ){ 
				// if we reach the end of the loop and doesnt not find repeating element then,
				// nonRepeat is the "First " non-Repeating element, we must "return" it.
					return nonRepeat;
				}
			}
		}
		return -1;
	}
	public static void main(String [] args){
		System.out.println("Enter the total number of elements:");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the " + n + " elements:" );
		for ( int i = 0 ; i < n; i++ ){
			arr[i] = s.nextInt();
		}
		System.out.println("The first non-zero element in the array is :" + nonRepeating(arr));
	}
}