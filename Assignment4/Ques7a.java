/* ASSIGNMENT - 4 QUESTION-7a
Problem Statement - Find equilibrium index of the array. Equilibrium index of an array is an
index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
Eg:Input -7,1,5,2,-4,3,0
Output - 3 is an equilibrium index because: A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
IDEA - The following way is simple and easy to think of but inefficient with time complexity of n^3.
We are going to check for each index if it an equillibrium index or not.
*/
import java.util.Scanner;
public class Ques7a{

	public static int findEqui(int [] arr){
		for( int i = 1 ; i < arr.length ; i++){
			int leftSum = 0;
			int rightSum = 0;
			for(int j = 0 ; j < i ; j++ ){
				leftSum += arr[j];
			}
			for(int j = i+1 ; j < arr.length ; j++){
				rightSum += arr[j];
			}
			if(leftSum == rightSum){
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String [] args){
		System.out.println("Enter the size of teh array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the elements:");
		for(int i = 0 ; i < n ; i ++){
			arr[i] = s.nextInt();
		} 
		System.out.println("The equilibrium index is : " + findEqui(arr));
	}
}