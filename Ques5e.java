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
		for (int i = 9 ; i > 0 ; i--){   // Looping N(here 9) times for even half of the pattern and printing only when the total number of stars in a row is even or equal to N (9)  
			if(i % 2 == 0 || i ==9){
			for (int j = i ; j > i/2 ; j--){ // Printing the stars
				System.out.print("* ");
			}
			for (int j = 0 ; j < k ; j++){  // Printing spaces
				System.out.print(" ");
			}
			for(int j = i/2 ; j > 0  ; j-- ){  // Printing stars
				System.out.print("* ");
			}
			System.out.println();
		}
		k = k+2;                          // Increasing the value of k for as the number of spacs increases in each row
		}


		// For lower half of the pattern
		for (int i = 1 ; i < 9 ; i++){
			k = k-2;                           // Spaces decreasing, stars increasing.
			if(i % 2 == 0 && i!=2){           //  i!= 2 is for the case for printing two stars in a row(We dont want that again as that case has been covered in the last loop for upper half of the pattern)    
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
		else if (i ==9){                    // For printing the last line with 9 stars
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