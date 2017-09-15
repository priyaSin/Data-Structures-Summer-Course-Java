/* ASSIGNMENT - 8 QUESTION - 2
Problem Statement - Implement Merge Sort.
*/
import java.util.Scanner;
public class Ques2{

	public static void  mergeSort(int [] arr){
		if(arr.length == 1){
			return;
		}
		int mid = arr.length/2;
		int [] leftArray = new int [mid];
		for(int i = 0 ; i < mid ; i ++){
			leftArray[i] = arr[i];
		}
		int j = 0;
		int [] rightArray = new int [arr.length - mid];
		for(int i = mid ; i < arr.length ; i++){
			rightArray[j] = arr[i];
			j++;
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray , rightArray , arr);

	}

	public static void merge(int [] leftArray , int [] rightArray , int [] arr) {
		int len = leftArray.length + rightArray.length;
		//int [] arr = new int [len];
		int i = 0 , j = 0 , k = 0;
		while(i < leftArray.length && j < rightArray.length){
			if(leftArray[i] < rightArray[j]){
				arr[k] = leftArray[i];
				i++;
			}
			else{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		if(i == leftArray.length){
			while(j < rightArray.length){
			arr[k] = rightArray[j];
			j++;
			k++;
			}
		}
		else if( j == rightArray.length){
			while(i < leftArray.length){
				arr[k] = leftArray[i];
				i++;
				k++;
			}
		}

	}


	public static void printArray(int [] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String [] args){
		System.out.println("Enter the size of the array to sort:");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the elements of the array:");
		for(int i = 0 ; i < n ; i ++){
			arr[i] = s.nextInt();
		}
		System.out.println("The given array is as follows: ");
		printArray(arr);
		mergeSort(arr);
		System.out.println("The sorted array is as follows: ");
		printArray(arr);

	}
}