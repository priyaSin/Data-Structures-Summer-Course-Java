/*  ASSIGNMENT - 3 QUESTION-9 
Problem Statement - You are given with an array containing only 0’s
and 1’s. Write a function to sort this array. Find a solution which scans the array only once.
IDEA - Counting the number of zeros and number of ones. Making an array of the same size 
and placing 0s and 1s according to their count.
*/
import java.util.Scanner;
public class Ques9{
	public static int [] sortBinaryArray(int [] arr){
			int zeroCount = 0;
			int oneCount = 0;
			for( int i = 0 ; i < arr.length ; i++ ){
				if(arr[i] == 0){
					zeroCount++ ;
				}
				else{
					oneCount++ ;
				}
			}
			int [] arr1 = new int [arr.length];
			for(int i = 0 ; i < arr1.length ; i++){
				if(zeroCount > 0){
				arr1[i] = 0;
				zeroCount --;
			}
			else{
			arr1[i] = 1;
			}
			}
			return arr1;
		}

	public static void printArray(int [] arr){
		for(int i = 0 ; i< arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String [] args){

		System.out.println("Enter the total number of elements in a array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the " + n + " elements (0s or 1s) :");
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		int [] sortArr = sortBinaryArray(arr);
		printArray(sortArr);
	}
}
