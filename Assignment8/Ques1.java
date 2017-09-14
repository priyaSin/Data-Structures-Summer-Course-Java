/* ASSIGNMENT - 8 QUESTION - 1
Problem Statement - Implement Binary Search
INFO - Binary search can only be implemented on a sorted array
*/
import java.util.Scanner;
public class Ques1{

	public static void sort(int [] arr){
		int hole;
		int j;
		for(int i = 1 ; i < arr.length ; i++){
			j = i-1;
			hole = arr[i];
			while(j >= 0 && hole < arr[j] ){
				int temp = arr[j];
				arr[j] = arr[j+1] ;
				arr[j+1] = temp;
				j--;
			}
		}
	}

	public static int binarySearch(int search , int start ,int end, int [] arr){
		int midIndex = (end + start)/2;
		if(start > end){
			return -1;
		}
		int mid = arr[midIndex];
		if(search == mid){
			return midIndex;
		}
		else if( search > mid){
			return binarySearch(search , midIndex + 1 , end , arr );
		}
		else{
			return binarySearch(search , start , midIndex -1 , arr );
		}
		

	}


	public static void main(String [] args){
		System.out.println("Enter the size of the array : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the elments of the array: ");
		int [] arr = new int [n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Enter a number to search:");
		int search = s.nextInt();
		sort(arr);
		if(binarySearch(search , 0 ,arr.length-1, arr) > -1){
			System.out.println("The number is present at index : " + binarySearch(search ,0 , arr.length-1, arr));
		}
		else{
			System.out.println("The number is not present in the array.");
		}
	}
}