/* ASSIGNMENT - 4 QUESTION-3
Problem Statement - Find second largest element in an array.
*/
import java.util.Scanner;
public class Ques3{
	public static int findSecondMax( int [] arr){
		int max = 0 ; 
		int secondMax = 0;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > max){
				secondMax = max ;
				max = arr[i];
			}
			else if( arr[i] > secondMax){
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the elements:");
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		} 
		int secondMax = findSecondMax(arr);
		System.out.println("The second Max element in the array : " + secondMax);

	}
}