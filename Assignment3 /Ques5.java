/* 
ASSIGNMENT - 3 QUESTION-5
Problem Statement - Given an array of integers A and an integer x. Find pairs of
elements in A, which sum to x.
*/
import java.util.Scanner;
public class Ques5{
	public static void findPairs(int [] arr , int x){
		int value = 0;
		for ( int i = 0 ; i < arr.length ; i++){
			// value to search for in the array
			value = x-arr[i];
			for ( int j = i+1 ; j < arr.length ; j++){
				if(arr[j] == value){
					// After we find the other element of the pair, we change both the values to
					//Maximum integral value so that the same pair doesnt appear again in further iterations
					// and break from the loop as we do not need to further look for the other element of teh pair
					System.out.println("The possible pair : (" + arr[i] + " , " +  arr[j] + ")");
					arr[i] = Integer.MAX_VALUE;
					arr[j] = Integer.MAX_VALUE;
					break;
				}
			}
		}
	}
	public static void main(String [] args){
		System.out.println("Enter the total number of elements in an array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr [] = new int [n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0 ; i < n ; i++ ){
			arr[i] = s.nextInt();
		}
		System.out.print("Enter the value of x to find pairs in array which sums to x:");
		int x = s.nextInt();
		findPairs(arr , x);
	}
}