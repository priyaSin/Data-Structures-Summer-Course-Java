/* ASSIGNMENT - 4 QUESTION-4a
Problem Statement - Given an array of integers A and an integer x. Find triplets of
elements in A which sum to x.
*/
import java.util.Scanner;
public class Ques4a{
	public static void sort(int [] arr){
		int value , j ;
		for ( int i = 1 ; i < arr.length ; i++){
			value = arr[i];
			j = i;
			while(j > 0 && arr[j-1] > value){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = value;
		}
		printArray(arr);
	}

	public static void printTriplets(int [] arr , int num){
		sort(arr);
		printArray(arr);
		int f , l , x;
		for( int i = 0 ; i < arr.length ; i ++){
		 f = i+1;
		 l = arr.length-1;
		 while(f < l){
		 	int sum = arr[i] + arr[f] + arr[l] ;
		 	if( sum == num ){
		 		System.out.print("(" + arr[i] + "," + arr[f] + "," + arr[l]+ ")");
		 		System.out.println();

		 		l--;
		 		f++;
		 	}
		 	else if(sum > num ){
		 		l --;
		 	}
		 	else{
		 		f++;
		 	}
		 }
		}
	}
	public static void printArray(int [] arr){
		for ( int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String [] args){
		System.out.println("Enter the size of the array:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the elements : ");
		int [] arr = new int [n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the value to find triplets for:");
		int sum = s.nextInt();
		printTriplets(arr , sum);
	}
}