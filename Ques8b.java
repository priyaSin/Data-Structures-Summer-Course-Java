/* ASSIGNMENT - 2 QUESTION-8(b)

Problem Statement - Write the programs to print the following patterns:
(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques8b{

	public static void printPattern(int N){
		for ( int i = 1 ; i <= N ; i++){ // Iterating through each row
			if(i == 1 ){                // 1 is to be printed on the first row and then start pattern
				System.out.println(1); // hence continue;
				continue;
			}
			for ( int j = 1 ; j <= i ; j++){ // Number of values in each row is equal to row number
				if(j == 1 || j == i){    // for first and last place in each row we need to put value "rowNumber -1 " 
				System.out.print(i - 1);
			}
			else{
				System.out.print(0);   //Else at all other places put "0"
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