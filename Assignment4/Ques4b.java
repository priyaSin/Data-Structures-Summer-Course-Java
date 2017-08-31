/* ASSIGNMENT - 4 QUESTION-4a
Problem Statement - Given an array of integers A and an integer x. Find triplets of
elements in A which sum to x.
*/
import java.util.Scanner;
public class Ques4b{

	public static void printTriplets(int [] arr , int num){
		for ( int i = 0 ; i < arr.length-2 ; i++){
			for( int j = 0 ; j < arr.length -1 ; j++){
				for( int k = 0 ; k < arr.length ; k++){
					if(arr[i] + arr[j] + arr[k] == num && (i != j && i != k && j !=k )){
						System.out.println("(" + arr[i] + " " + arr[j] + " " + arr[k] + ")");
					}
				}
			}
		}
	}


	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the elements : ");
		int [] arr = new int [n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the value to find triplets for:");
		int sum = s.nextInt();
		printTriplets(arr , sum);
	}
}