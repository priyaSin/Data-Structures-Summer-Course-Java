/* ASSIGNMENT - 2 QUESTION-8(b)

Problem Statement - Write the programs to print the following patterns:
(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques8b{

	public static void printPattern(int N){
		for ( int i = 1 ; i <= N ; i++){
			if(i == 1 ){
				System.out.println(1);
				continue;
			}
			for ( int j = 1 ; j <= i ; j++){
				if(j == 1 || j == i){
				System.out.print(i - 1);
			}
			else{
				System.out.print(0);
			}
			}
			System.out.println();
		}
	}

	public static void main(String [] args){
		System.out.println("Enter the value of N :");
		Scanner s = new Scanner (System.in);
		int N = s.nextInt();
		printPattern(N);
	}
}