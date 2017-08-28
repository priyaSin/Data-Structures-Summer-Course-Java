/* ASSIGNMENT - 2b QUESTION-2

Problem Statement - Write a program to print first 20 terms of the series 3n+2 which are not
multiples of 4.

*/
import java.util.Scanner;
public class Ques2{

	public static void printSeries(int n){
		int count = 0;
		for(int i = 1 ; i <= n ; i++){     
			if(count == 20){                    // As the count (number of multiples) reaches 20, stop.
				break;
			}
			if((3 * i + 2) % 4 == 0){           //Check if 3n+2 is a multiple of 4 or not.
				System.out.println(3 * i + 2);
				count++;
			}

		}
	}


	public static void main(String [] args){
		System.out.println("Enter the value of N:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printSeries(n);
	}
}
