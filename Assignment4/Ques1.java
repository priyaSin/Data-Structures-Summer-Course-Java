/* ASSIGNMENT - 4 QUESTION-1
Problem Statement - Insertion Sort
*/
import java.util.Scanner;
public class Ques1{

	public static void insertionSort(int [] arr){
		int value , j;
		for(int i = 1 ; i < arr.length ;i++){
			value = arr[i];
			j = i;
			while(j > 0 && arr[j-1] > value){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = value;
			
		}
	}



	public static void printArray(int [] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i] + " ");
		}
	}
	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the " + n + " elements:");
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Given array :");
		printArray(arr);
		insertionSort(arr);
		System.out.println("Sorted Array");
		printArray(arr);
	}
} 