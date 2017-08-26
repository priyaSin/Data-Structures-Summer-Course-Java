/*
ASSIGNMENT - 1 QUESTION-5(e)
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)
 
Problem Statement - Write pseudo-codes which reads number of lines N and prints the following
patterns. [Two different pseudo-code for both patterns]

(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques5e{
	public static void printPattern( int N){
		int k = 0;
		//For upper half of the pattern
		for (int i = 9 ; i > 0 ; i--){
			if(i % 2 == 0 || i ==9){
			for (int j = i ; j > i/2 ; j--){
				System.out.print("* ");
			}
			for (int j = 0 ; j < k ; j++){
				System.out.print(" ");
			}
			for(int j = i/2 ; j > 0  ; j-- ){
				System.out.print("* ");
			}
			System.out.println();
		}
		k = k+2;
		}
		k = k-2; // Resetting the k value
		// For lower half of the pattern
		for (int i = 2 ; i < 9 ; i++){
			k = k-2;
			if(i % 2 == 0 && i!=2){
			for (int j = 0 ; j < i/2 ; j++){
				System.out.print("* ");
			}
			for (int j = 0 ; j < k ; j++){
				System.out.print(" ");
			}
			for(int j = 0 ; j < i/2  ; j++ ){
				System.out.print("* ");
			}
			System.out.println();
		}
		else if (i ==9){
			for( int j = 0 ; j < 9 ; j++){
				System.out.print("* ");
			}
		}
		}
	}


	public static void main(String [] args){
		System.out.println("Enter the value of N : ");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		printPattern(N);
	}
}