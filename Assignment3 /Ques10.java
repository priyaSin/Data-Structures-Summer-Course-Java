/*  ASSIGNMENT - 3 QUESTION-9 
Problem Statement - Bubble Sort
*/
import java.util.Scanner;
public class Ques10{

	public static void bubbleSort(int [] arr){
		for(int i = 0 ; i < arr.length-1 ; i++){
			for ( int j = 0 ; j< arr.length-i-1 ; j++){
				if(arr[j] > arr[j+1] ){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void printArray(int [] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + ",");
		}
	}

	public static void main(String [] args){
		System.out.println("Enter the total number of elements: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the " + n + " elements to apply Bubble Sort:");
		for( int i = 0 ; i < arr.length ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Given array:");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("Sorted array:");
		printArray(arr);
	}
}