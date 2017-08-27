/* ASSIGNMENT - 2 QUESTION-3

Problem Statement - Write a program to calculate the total salary of a person. The user has to enter
the basic and the grade and depending upon which the total salary is calculated as:

t_sal = basic + hra + da + allow – pf
	where :
		hra = 20% of basic
		da = 50% of basic
		allow = 1700 if grade = ‘A’
	    allow = 1500 if grade = ‘B’
	    allow = 1300 if grade = ‘C’ 
	    pf = 11% of basic.
*/
import java.util.Scanner;
public class Ques3{

	public static double totalSalary(int basic , char grade){
		int allow = 0;
		double hra = 0.2 * basic;
		double da = 0.5 * basic;
		double pf = 0.11 * basic;
		if(grade == 'A'){
			allow = 1700;
		}
		else if(grade == 'B'){
			allow = 1500;
		}
		else {
			allow = 1300;
		}
		return basic + hra + da + allow - pf;
}
	public static void main(String [] args){
		System.out.println("Enter the basic salary:");
		Scanner s = new Scanner (System.in);
		int basic = s.nextInt();
		System.out.println("Enter the grade of the person:");
		char grade = s.next().charAt(0);
		double t_salary = totalSalary(basic ,grade);
		System.out.println("The total salary of person with basic = " + basic + " and grade = " + grade + " : " + t_salary);
	}
}