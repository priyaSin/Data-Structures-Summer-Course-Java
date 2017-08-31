/* ASSIGNMENT - 4 QUESTION-6
Problem Statement - A sorted array has been rotated by some number k in clockwise
direction. Find k. E.g. Input: 5,6,1,2,3,4 Output: 2
*/
import java.util.Scanner;
public class Ques6{

	public static int kRotated(int [] arr){
		for(int i = 0 ; i < arr.length-1 ; i++){
			if(arr[i] > arr[i+1]){
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int [n];
		System.out.println("Enter a sorted array rotated by some number k:");
		for(int i = 0 ; i < n ; i ++){
			arr[i] = s.nextInt();
		}
		System.out.println("The array has been rotated by " + kRotated(arr));
	}
}