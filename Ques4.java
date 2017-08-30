/* 
ASSIGNMENT - 3 QUESTION-4
Problem Statement - Print sum of all positive and negative numbers separately in
an array.
*/
import java.util.Scanner;
public class Ques4{
	public static void printSum(int [] arr){
		int posSum = 0 ; 
		int negSum = 0 ;
		for ( int i = 0 ; i < arr.length ; i++){
			if(arr[i] > 0){
				posSum += arr[i];
			}
			else{
				negSum += arr[i];
			}
		}
		System.out.println("The sum of the positive numbers of an array = " +
		 posSum + "\n" + "The sum of the negative numbers of an array =  " + negSum );

	}
	public static void main(String [] args){
		System.out.println("Enter the total number of elements of an array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr [] = new int [n];
		System.out.println("Enter the " + n + " elments:");
		for ( int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		printSum(arr);
	}
}