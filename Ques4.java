/* ASSIGNMENT - 2 QUESTION-4

Problem Statement - Write a program to calculate the roots of a quadratic equation ax^2+bx+c=0,
display them on the screen specifying their nature.

Roots of an equation are given by = (-b +- (D)^0.5)/2a where D = b^2 - 4ac.

*/
import java.util.Scanner;
import java.lang.Math;
public class Ques4{
	public static double [] findRoots(double D ,double a , double b){
		double root1 = (-b + Math.pow(D , 0.5))/ 2*a ;
		double root2 =  (-b + Math.pow(D , 0.5))/ 2*a ;
		double roots[] = {root1 , root2};
		return roots;

	} 
	public static void main(String [] args){
		System.out.println("For the quadratic equation ax^2+bx+c=0, enter the values of a , b , c: ");
		Scanner s = new Scanner (System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		double D = Math.pow(b , 2) - 4 * a * c; // Discriminant = b^2 - 4ac
		if(D >= 0){
			double [] roots = findRoots(D , a , b);
			System.out.println("The roots of the given equation are real in nature and are equal to :" +roots[0] + " " + roots[1] );
		}
		else{
			System.out.println("The roots of the given equation are not real in nature.");
		}

	}
}
