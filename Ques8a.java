/* ASSIGNMENT - 2 QUESTION-8(a)

Problem Statement - Write the programs to print the following patterns:
(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques8a{

	public static void printPattern(int N){
		for (int i = 0 ; i < N ; i++){
			for (int j = 0 ; j <= i ; j++) {
				System.out.print(1);
			}
			System.out.println();
		}


	}

	public static void main(String [] args){
		System.out.println("Enter the value for N:");
		Scanner s = new Scanner (System.in);
		int N = s.nextInt();
		printPattern(N);
	}
}