/* ASSIGNMENT - 1 QUESTION-5(b)
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)
 
Problem Statement - Write pseudo-codes which reads number of lines N and prints the following
patterns. [Two different pseudo-code for both patterns]

(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques5b{

	public static void printPattern(int N){
		int k = N;
		for (int i = 0 ; i < N ; i++) { // For N rows

			for (int j = 0 ; j < k ; j++){ // For putting values in each row

				System.out.print(" ");    // Printing spaces at the beginning of each row
			}
			for (int j = 0 ; j <= i ; j++){
				if(j == 0 || j == i){
					System.out.print(1 + " ");
				}
				else{
				System.out.print(0 +" ");
			}
		}
		System.out.println();
		k = k-1; // decreasing K after each row is printed (giving one less space for each row as the number of digits in each row is increasing by one )
	}	
}
	public static void main(String [] args){
		System.out.println("Enter the value of N:");
		Scanner s = new Scanner (System.in);
		int N = s.nextInt();
		printPattern(N);
	}
}