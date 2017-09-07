/* ASSIGNMENT - 5 QUESTION - 9
Problem Statement - Rotate a 2D matrix by 90 degrees clockwise
E.g - Consider Array 
1 2 3
4 5 6
7 8 9
After rotating 90 degrees clockwise it will be - 
7 4 1
8 5 2
9 6 3
*/
import java.util.Scanner;
public class Ques9{

	public static int [] [] rotate90(int [] [] arr){
		int rows = arr.length;
		int columns = arr[0].length;
		int [] [] arr1 = new int [rows][columns];
		for(int i = 0 ; i < rows ; i ++){
			for(int j = 0 ; j < columns ; j++){
				arr1[j][rows-i-1] = arr[i][j];
			}
		}
		return arr1;
	}

	public static void printArray(int [] [] arr){
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[0].length ; j ++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		System.out.println("Enter the dimension of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the elements:");
		int [] [] arr = new int [n][n];
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				arr[i][j] = s.nextInt();
			}
		}
		System.out.println("Given Array:");
		printArray(arr);
		int [] [] arr1 = rotate90(arr);
		System.out.println("Rotated Array : ");
		printArray(arr1);

	}
}