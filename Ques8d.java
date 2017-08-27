/* ASSIGNMENT - 2 QUESTION-8(d)

Problem Statement - Write the programs to print the following patterns:
(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques8d{

	public static void printPattern(int N){
		for( int i = N ; i >= 1 ; i--){
			for ( int j = 1 ; j <=i ; j++ ){
				System.out.print(j);
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