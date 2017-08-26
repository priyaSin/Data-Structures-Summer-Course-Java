/* ASSIGNMENT - 1 QUESTION-5(a)
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)
 
Problem Statement - Write pseudo-codes which reads number of lines N and prints the following
patterns. [Two different pseudo-code for both patterns]

(See the patterns in the assignment)
*/

import java.util.Scanner;
public class Ques5a{

	public static void printPattern(int N) {
		for (int i = 0 ; i < N ; i++){          // for number of rows
			for (int j = 1 ; j <= N-i ;j++ ){    // digits to be printed on each line
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
			System.out.println("Enter the value of N :");
			Scanner s = new Scanner(System.in);
			int N = s.nextInt();
			printPattern(N);
	}
}
