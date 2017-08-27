/* ASSIGNMENT - 1 QUESTION-1 
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)

Ques1 Statement - Draw a flowchart to Print all numbers less than N which are part of Fibonacci Series
*/

import java.util.Scanner;
public class Ques1{

	public static void printFibonacci(int N ){
		if(N <= 0){
			System.out.println("Fibonacci Series cant be printed");
		}
		else if(N == 1){
			System.out.print(0 +" ");
		}
		else{
		System.out.print(0 +" "+ 1 + " ");
		for (int i = 0 ; 2*i+1 <N ; i++){
			System.out.print(i + i+1 +" ");
		}
	}
	}
	public static void main(String [] args){
		System.out.println("Enter the value of N :");
		Scanner s = new Scanner (System.in);
		int N = s.nextInt();
		printFibonacci(N);
	}
}

