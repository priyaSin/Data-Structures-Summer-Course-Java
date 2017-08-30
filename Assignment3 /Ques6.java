/* 
ASSIGNMENT - 3 QUESTION-6
Problem Statement - Find the duplicate number in an array of size n with numbers
from 0 to n-2. Each number is present at least once.
(Assuming that in case of no duplicate number present -1 is returned)
*/
import java.util.Scanner;
public class Ques6{
	public static int findDuplicate(int [] arr){
		for ( int i = 0 ; i < arr.length ; i++ ){
			for ( int j = i+1 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){
					return arr[j];
				}
			}
		}
		return -1;

	}
	public static void main(String [] args){
		System.out.println("Enter the size of an array:");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the " + n + " elements out of which only n-1 should be distintive:");
		for ( int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("The duplicate number is :" + findDuplicate(arr));
	}
}