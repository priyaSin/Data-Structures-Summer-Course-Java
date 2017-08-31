/* ASSIGNMENT - 4 QUESTION-2a
Problem Statement - Given two arrays print their intersection.
Instead of printing write a function which returns their intersection.
*/
import java.util.Scanner;
public class Ques2b{

	public static int [] returnIntersection( int [] arr1, int [] arr2){
		int n = arr1.length < arr2.length ? arr1.length : arr2.length;
		int [] arr3 = new int [n];
		int count = 0;
		for(int i = 0 ; i < arr1.length ; i++){
			for ( int j = 0 ; j < arr2.length ; j++){
				if(arr1[i] == arr2[j]){
					arr3[count] = arr1[i];
					count++;
				}
			}
		}
		return arr3;
	}

	public static void printArray(int [] arr){
		for( int i = 0 ; i < arr.length ; i++){
		System.out.print(arr[i] + " , ");
		}
	}

	public static void main(String [] args){
		System.out.println("Enter the size of first array:");
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int [] arr1 = new int [n1];
		System.out.println("Enter the elements:");
		for(int i = 0 ; i < n1 ; i++){
			arr1[i] = s.nextInt();
		}
		System.out.println("Enter the size of second array:");
		int n2 = s.nextInt();
		int [] arr2 = new int [n2];
		System.out.println("Enter the elements:");
		for(int i = 0 ; i < n2 ; i++){
			arr2[i] = s.nextInt();
		}
		System.out.println("First array:");
		printArray(arr1);
		System.out.println("Second Array:");
		printArray(arr2);
		int [] arr3 = returnIntersection(arr1 , arr2);
		System.out.println("Intersection of the two arrays:");
		printArray(arr3);

	}
}