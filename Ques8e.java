/* ASSIGNMENT - 2 QUESTION-8(a)

Problem Statement - Write the programs to print the following patterns:
(See the patterns in the assignment)
*/
import java.util.Scanner;
public class Ques8e{
	public static void printPattern(int N){
		for (int i = 1 ; i <= N  ; i++){
			for(int j = N ; j >=1 ; j--){
				if(j == i){
					System.out.print("*");
				}
				else{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		System.out.println("Enter the value of N : ");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		printPattern(N);
	}
}