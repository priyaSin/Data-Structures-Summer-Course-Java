/* ASSIGNMENT - 4 QUESTION-5a
Problem Statement - You are given with an array containing only 0’s, 1’s and 2’s. Write a
function to sort this array. Also find another solution which scans the
array once.
*/
import java.util.Scanner;
public class Ques5a{

	public static int [] sort(int [] arr){
		int zeroCount = 0 ; 
		int oneCount = 0 ;
		int twoCount = 0;
		int [] arr1 = new int [arr.length];
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == 0){
				zeroCount ++ ;
			}
			else if (arr[i] == 1){
				oneCount ++;
			}
			else{
				twoCount++;
			}
		}
		for(int i = 0 ; i < arr1.length ; i++){
			if(zeroCount > 0){
				arr1[i] = 0;
				zeroCount --;
			}
			else if(oneCount > 0){
				arr1[i] = 1;
				oneCount--;
			}
			else if(twoCount > 0){
				arr1[i] = 2;
				twoCount --;
			}
		}
		return arr1;
		
	}
	public static void printArray(int [] arr){
		for( int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the elements ( 0s , 1s and 2s):");
		for( int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Given Array:");
		printArray(arr);
		int [] arr1 = sort(arr);
		System.out.println("Sorted Array:");
		printArray(arr1);

	}
}
