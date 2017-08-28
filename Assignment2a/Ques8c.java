/* ASSIGNMENT - 2 QUESTION-8(c)

Problem Statement - Write the programs to print the following patterns:
(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques8c{

	public static void printPattern(int N){
		for ( int i = 1 ; i <= N ; i++){  //Iterating through each row
			if(i == 1){                   // Printing 1 for first row and then starting the pattern printing in teh next iteration
				System.out.println(1);
				continue;
			}
			for(int j = 1 ; j <= i ; j++){ // Number of values in each row is equal to row number
				if( j == 1 || j == i){    // For the first and last place in each row print "1"
					System.out.print(1);
				}
				else{
					System.out.print(2); //Else print " 2 " at all other places in each row
				}
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