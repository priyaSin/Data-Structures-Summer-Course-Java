/* ASSIGNMENT - 2 QUESTION-1

Problem Statement - Write a program to input name and marks of three tests of a student and
calculate and print the name and average of best two test marks.
(assuming that the marks are integral values)

*/
import java.util.Scanner;
public class Ques1{

	public static int [] findTwoMax( int [] arr){
		int max1 = 0;
		int max2 = 0;
		for( int i = 0 ; i < arr.length ; i++){
			if(arr[i] > max1){
				max2 = max1;
				max1 = arr[i];
			}
			else if (max2 < arr[i]){
				max2 = arr[i];
			}
		}
		int max2values [] = { max1 , max2};
		return max2values;
	}
	public static double findAverage(int [] arr){
		int sum = 0;
		for ( int i = 0 ; i < arr.length ; i++){
			sum += arr[i];
		}
		return sum/arr.length;
	}

	public static void main(String [] args){
		System.out.println("Enter the name of the student:");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("Enter the marks for three subjects:");
		int arr [] = new int [3];
		for (int i = 0 ; i < 3 ; i++){
			arr[i] = s.nextInt();
		}
		int max2values [] = findTwoMax(arr); 
		double avg = findAverage(max2values);
		System.out.println("The name of the student is : " + name);
		System.out.println("The average of the best of two marks is : " + avg);
		}
}
