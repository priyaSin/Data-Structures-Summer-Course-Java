/* ASSIGNMENT - 1 QUESTION-3
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)

Problem Statement - Write a pseudo-code which reads N from user and prints all prime numbers from 2 to N.

*/
import java.util.Scanner;

public class Ques3{
	public static void printPrime(int N){
		if(N < 2){
			System.out.println("Least prime number is 2. Series can not be printed.");
			return;
		}
		for(int i = 2 ; i < N ; i++){
			Boolean isPrime = true;
			for(int j = 2 ; j< i ; j++ ){
				if (i%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				System.out.print(i + " ");
			}
		}	
	}
	public static void main(String [] args){
		System.out.println("Enter the value of N:");
		Scanner s = new Scanner (System.in);
		int N = s.nextInt();
		printPrime(N);
	}
}