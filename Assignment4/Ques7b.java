/* ASSIGNMENT - 4 QUESTION-7b
Problem Statement - Find equilibrium index of the array. Equilibrium index of an array is an
index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
Eg:Input -7,1,5,2,-4,3,0
Output - 3 is an equilibrium index because: A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

IDEA - 1. Right Sum = Total sum of the array
	   2. Left Sum = 0
	   3. Loop:
	   		update left sum by adding the element iterated upon
	   		update right sum by decreasing the element iterated upon 
	   		check if left sum == right sum
	   		return the index
*/
import java.util.Scanner;
public class Ques7b{
	public static int findEquIndex(int [] arr){
	int sum = 0;
	for(int i = 0 ; i < arr.length ; i++){
		sum += arr[i];
	}
	int leftSum = 0;
	int rightSum = sum - arr[0];
	for(int i = 1 ; i < arr.length ; i++){
		rightSum -= arr[i];
		leftSum += arr[i-1];
		if(leftSum == rightSum ){
			return i;
		}
	}
	return -1;
}
	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the elements:");
		int [] arr = new int [n]; 
		for( int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("The equilllibrium index is :" + findEquIndex(arr));
	}
}
