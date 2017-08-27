/*
ASSIGNMENT - 1 QUESTION-5(c)
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)
 
Problem Statement - Write pseudo-codes which reads number of lines N and prints the following
patterns. [Two different pseudo-code for both patterns]

(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques5d{
	public static void printPattern(int N){
		int k = N;                         // k = Number of spaces in each row
		int stars = 1;					   // Number of stars in each row starting from 1 in 1st row

		// Making the upper half of the pattern
		for (int i = 1 ; stars < N ; i++){    // Iterating through each row
							  				// We have to stop as the number of stars reach == N
			for (int j = 0 ; j < k ; j++){ //Printing the number of spaces in each row
				System.out.print(" ");
			}
			k = k-2;                       // Number of elements are increasing by 2 here, so spaces has been decreasing by 2
			for (int j = 1 ; j<= stars ; j++){
				System.out.print("* ");
			}
			System.out.println();
			stars +=2;                    // Number of stars are increaing by 2

		}
		// Making the lower half of the pattern
		for (int i = stars ; stars >= 1 ; i--){
			for (int j = 0 ; j < k ; j++){ //Printing the number of spaces in each row
				System.out.print(" ");
			}
			k = k + 2;                       // Number of elements are decreasing by 2 here, so spaces has been increasing by 2	
			for (int j = 1 ; j<= stars ; j++){
				System.out.print("* ");
			}
			System.out.println();
			stars -=2;
		}

	}
	public static void main(String [] args){
		System.out.println("Enter the value of N:");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		printPattern(N);
	}
}