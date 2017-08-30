/* 
ASSIGNMENT - 3 QUESTION-3
Problem Statement - Reverse an array. Same array should be reversed.

IDEA - Swapping the first and the last element, similary second and second last and so on.
*/

import java.util.Scanner;
public class Ques3{
	public static void reverseAnArray(int [] arr){
		int temp = 0;
		for ( int i = 0 ; i < arr.length/2 ; i++){
			//Swapping first and last element, similarly second and second last and so on
			// until we reach the middle element (arr.length/2) of the array
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length -1 -i] = temp;
		}

	}

	public static void printArray(int [] arr){
		for ( int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String [] args){
		System.out.println("Enter the total number of elements in an array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr [] = new int [n];
		System.out.println("Enter the " + n + " elements");
		for ( int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		reverseAnArray(arr);
		printArray(arr);
	}
}