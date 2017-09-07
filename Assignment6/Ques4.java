/* ASSIGNMENT - 6 QUESTION - 4
Problem Statement - Write a function that returns sum of all elements of an array.
*/
import java.util.Scanner;
public class Ques4{

	public static int sumOfElements(int [] arr , int i){
		if( i == arr.length -1){
			return arr[i];
		}
		return arr[i] + sumOfElements(arr , i+1);
	}

	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the elements :");
		int [] arr = new int [n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("The sum of all the elements of an array : " + sumOfElements(arr , 0));
	}
}