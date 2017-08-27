/* ASSIGNMENT - 1 QUESTION-5(c)
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)
 
Problem Statement - Write pseudo-codes which reads number of lines N and prints the following
patterns. [Two different pseudo-code for both patterns]

(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques5c{
	public static void printPattern(int N ){
		int k = N;
		for (int i = N ; i > 0 ; i-- ){      // traversing through each row (taking i in decreasing order)
			for (int j = 0 ; j < k ; j++){   // printing spaces in each  row (value of k = number of spaces)
				System.out.print(" ");
			}
			k = k-1;                        // As in each row the number of digits is increasing by one, we are decreasing number of spaces by one

			for(int j = 0 ; j <= N-i ; j++){  //Number of digits to be printed in each row after spaces
				System.out.print(i + " ");
			}
			System.out.println();           // For iterating to the next row
		}
	}
	public static void main(String [] args){
		System.out.println("Enter the value of N:");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		printPattern(N);
	}

}