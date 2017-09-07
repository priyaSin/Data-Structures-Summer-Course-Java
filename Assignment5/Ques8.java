/* ASSIGNMENT - 5 QUESTION - 8
Problem Statement - Write a program to multiply 2D arrays A and B of dimensions NxL and
LxM respectively.
*/
import java.util.Scanner;
public class Ques8{

	public static int [] [] mul(int [] [] arr1 , int [] [] arr2){
		int N = arr1.length;
		int L = arr2.length;
		int M = arr2[0].length;
		int [] [] arr = new int [N] [M];
		for(int k = 0 ; k < N ; k++){
		for(int i = 0 ; i < M ; i ++){
			for(int j = 0 ; j < L ; j++){
				arr[k][i] += arr1[k][j] * arr2[j][i];
			}

		}
	}
	return arr;
	}

	public static void printArray(int [] [] arr){
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[0].length ;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String [] args){
		System.out.println("Enter the dimensions NxL of the first array: ");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int L = s.nextInt();
		int [][] arr1 = new int [N][L];
		System.out.println("Enter the elements:");
		for(int i = 0 ; i < N ; i ++){
			for(int j = 0 ; j < L ; j++){
				arr1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter the second dimension (M of LxM) the second array: ");
		int M = s.nextInt();
		System.out.println("Enter the elements:");
		int [][] arr2 = new int [L][M];
		for(int i = 0 ; i < L ; i ++){
			for(int j = 0 ; j < M ; j++){
				arr2[i][j] = s.nextInt();
			}
		}
		printArray(arr1);
		printArray(arr2);
		int [] [] arr = mul(arr1 , arr2);
		System.out.println("The multiplication of the arrays:");
		printArray(arr);

	}
}
