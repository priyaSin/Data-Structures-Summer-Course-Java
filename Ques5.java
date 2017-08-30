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
			value = x-arr[i];
			for ( int j = 0 ; j < arr.length ; j++){
				if(arr[j] == value){
					System.out.println("The possible pair : (" + arr[i] + " , " +  arr[j] + ")");
					arr[i] = Integer.MIN_VALUE;
					arr[j] = Integer.MIN_VALUE;
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