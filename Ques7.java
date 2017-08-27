/*
ASSIGNMENT - 1 QUESTION- 7
(THIS ASSIGNMENT IS TO MAKE FLOWCHARTS AND WRITE PSUEDOCODES, BUT I AM CODING THESE QUESTIONS)

Problem Statement - Starting from point (0,0) on a plane, we have written all non-negative integers
0, 1, 2,... as shown in the figure. For example, 1, 2, and 3 has been written at points (1,1),
(2,0), and (3, 1) respectively and this pattern has continued.

[SEE THE ASSIGNMENT FOR FOR GRAPH FIGURE]

You are to write a pseudo-code that reads the coordinates of a point (x, y), and writes the number
(if any) that has been written at that point. (x, y) coordinates in the input are in the range
0...100000.
 */

import java.util.Scanner;
public class Ques7{
	public static int numAtCoordinate(int x , int y ){
		if ( x%2 != 0 && y%2 != 0){
			return x+y-1;
		}
		else if( x%2 == 0 && y %2 == 0){
			return x+y;
		}
		return -1;
	}
	public static void main(String [] args){
		System.out.println("Enter the value of x and y:");
		Scanner s = new Scanner (System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int num = numAtCoordinate( x, y );
		if(num < 0){
			System.out.println("No number is present at coordinate according to the sequence.");
		}
		else {
			System.out.println("Number present at the coordinate " + "(" + x + ","+ y+ ")" + " : "+ num);
		}
	} 
}
