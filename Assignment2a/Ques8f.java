/* ASSIGNMENT - 2 QUESTION-8(a)

Problem Statement - Write the programs to print the following patterns:
(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques8f{

	public static void printPattern(int N){
		for (int i = 5 ; i >= 1 ; i--){
			for (int j = i ; j >=1 ; j--){ // Number of values on each row is equal to i (5 to 1 in decreaing order for 1st row )
				if( i % 2 == 0){        // Printing 0 in the row where row number is even
					System.out.print(0);
				}
				else{
					System.out.print(1);  // Printing 1 in the row where row number is odd
				}
			}
			System.out.println();
		}
	}

	public static void main(String [] args){
		System.out.println("Enter the value of N:");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		printPattern(N);
	}
}