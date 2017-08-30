/* 
ASSIGNMENT - 3 QUESTION-2 
Problem Statement - Find product of all numbers in an array.
*/

import java.util.Scanner;
public class Ques2{
	public static int findProduct(int [] arr){
		int product = 1;
		for ( int i = 0 ; i < arr.length ; i++){
			product *= arr[i];
		}
		return product;
	}
	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter the " + n + " elements");
		for(int i = 0 ; i < n ; i ++){
			arr[i] = s.nextInt();
		}
		System.out.println("The product of all elements of the array given = " + findProduct(arr));
	}
}