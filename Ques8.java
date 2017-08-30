/* 
ASSIGNMENT - 3 QUESTION-7
Problem Statement - You are given two arrays. Find the sum of the two arrays and
put the result in another array.
E.g. if you are given [1,2,4] and [4,5,6] then output should be [5,8,0].
*/
import java.util.Scanner;
public class Ques8{

	public static int [] sumTwoArrays( int [] arr1 , int [] arr2){
		int [] arr3 = new int [arr1.length +1];
		int sum = 0;
		for(int i = arr3.length-1 ; i > 0 ; i-- ){
			sum = (arr1[i-1] + arr2[i-1] + arr3[i]) ;
			System.out.print(" ALREADY PRESENT VALUE (CARRY FROM LAST SUM)" + arr3[i]);
			System.out.println();
			if(sum >= 10){
				arr3[i-1] = sum/10;
			}
			
			System.out.print(" SUM OF THE TWO AND PREVIOUS VALUE:  " +sum );
			System.out.println();
			System.out.print("CARRY GENERATED " + arr3[i-1]);
			System.out.println();
			arr3 [i] = sum % 10;
		}
		return arr3;
	}

	public static void printArray(int [] arr3){
		for ( int i = 0 ; i < arr3.length ; i++){
			System.out.print(arr3[i] + " , ");
		}
	}


	public static void main(String [] args){
		System.out.println("Enter the total number of elements in an array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr1 = new int [n];
		int [] arr2 = new int [n];
		System.out.println("Enter the n elements for the first array:");
		for( int i = 0 ; i < n ; i++){
			arr1[ i ] = s.nextInt();
		}
		System.out.println("Enter the n elements for the second array:");
		for( int i = 0 ; i < n ; i++){
			arr2[ i ] = s.nextInt();
		}
		System.out.println("The first array is : ");
		printArray(arr1);
		System.out.println();
		System.out.println("The second array is : ");
		printArray(arr2);
		System.out.println();
		int [] arr3 = sumTwoArrays(arr1 , arr2);
		System.out.println("The sum of the two arrays is :");
		printArray(arr3);

	}
}