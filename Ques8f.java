/* ASSIGNMENT - 2 QUESTION-8(a)

Problem Statement - Write the programs to print the following patterns:
(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques8f{

	public static void printPattern(int N){
		for (int i = 5 ; i >= 1 ; i--){
			for (int j = i ; j >=1 ; j--){
				if( i % 2 == 0){
					System.out.print(0);
				}
				else{
					System.out.print(1);
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