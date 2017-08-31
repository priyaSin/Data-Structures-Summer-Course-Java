/* ASSIGNMENT - 4 QUESTION-5b
Problem Statement - You are given with an array containing only 0’s,
1’s and 2’s. Write a function to sort this array. Also find another solution which scans the array
once. 
IDEA -  Your goal is to sort an array of 0, 1 and 2's but you must do this in place, in linear
time and without any extra space (such as creating an extra array). This is called the Dutch
national flag sorting problem. For example, if the input array is [2,0,0,1,2,1] then your program
should output [0,0,1,1,2,2] and the algorithm should run in O(n) time.

ALGORITHM-
(1) Create a low pointer at the beginning of the array and a high pointer at the end of the array.
(2) Create a mid pointer that starts at the beginning of the array and iterates through each element.
(3) If the element at arr[mid] is a 2, then swap arr[mid] and arr[high] and decrease the high pointer by 1.
(4) If the element at arr[mid] is a 0, then swap arr[mid] and arr[low] and increase the low and mid pointers by 1.
(5) If the element at arr[mid] is a 1, don't swap anything and just increase the mid pointer by 1.


*/
import java.util.Scanner;
public class Ques5b{
	public static void sort(int [] arr){
		int low = 0 ;
		int mid = 0 ;
		int high = arr.length -1;
		while(mid <= high){
			if(arr[mid] == 0){
				swap(arr, low , mid);
					low++;
					mid ++;
			}
			else if(arr[mid] == 2){
				swap(arr , mid , high);
				high--;
			}
			else{
				mid++;
			}
		}
	}
	public static void swap(int [] arr , int  i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	public static void printArray(int [] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}



	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the elements:");
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Given array:");
		printArray(arr);
		sort(arr);
		System.out.println("Sorted array:");
		printArray(arr);
	}
}