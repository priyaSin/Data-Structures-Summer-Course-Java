/* ASSIGNMENT - 4 QUESTION-2a
Problem Statement - Given two arrays print their intersection.
Instead of printing write a function which returns their intersection.
*/
import java.util.Scanner;
public class Ques2a{

	public static void printIntersection(int [] arr1, int [] arr2){
		for(int i = 0 ; i < arr1.length ; i++){
			for(int j = 0 ; j < arr2.length ; j++){
				if(arr1[i] == arr2[j]){
					System.out.print(arr1[i] + " , ");
				}
			}
		}
	}

	public static void main(String [] args ){
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
		printIntersection(arr1 , arr2);

	}
}
