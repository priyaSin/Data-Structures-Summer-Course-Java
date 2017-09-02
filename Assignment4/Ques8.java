/* ASSIGNMENT - 4 QUESTION-7b 
Problem Statement - Given an array of integers, sort the array into a
wave like array and return it. In other words, arrange the elements into a sequence such that a1 >=
a2 <= a3 >= a4 <= a5 >=a6....

IDEA - Sort the array and then swap the adjecent elements.
*/
import java.util.Scanner;
public class Ques8{

	public static void sort(int [] arr){
		int value = 0;
		int j = 0;
		for( int i = 1 ; i < arr.length ; i++){
			value = arr[i];
			j = i; 
			while(j > 0 && arr[j] > value){
				arr[j] = arr[j-1];
			}
			arr[j] = value;
		}
	}

	public static void swap ( int [] arr , int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int [] sortWaveLike(int [] arr){
		sort(arr);
		for( int i = 0 ; i < arr.length-1 ; i = i+2){
			swap(arr , i , i+1);
		}
		return arr;
	}
	public static void printArray(int [] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the elements:");
		for( int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Given Array:");
		printArray(arr);
		int [] arr1 = sortWaveLike(arr);
		System.out.println("Wave-like Sorted Array:");
		printArray(arr1);
	}
}
