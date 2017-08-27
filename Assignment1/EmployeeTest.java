/* A program covering basic OOP concept of Java programming
Only one public class i.e "EmployeeTest" is present. */

import java.util.Scanner;

class Employee{
	String name;
	int age;
	String designation;
	double salary;


	public Employee(String name){
		this.name = name;
	}

	public Employee(String designation , int age){
		this.designation = designation;
	}
    /*Set methods for each of the instance variables.
    We can later put access modifiers to these set method in order 
    to ensure data abstraction feature of Java */

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setDesignation(String designation){
		this.designation = designation;
	}
	public void setSalary (double salary){
		this.salary = salary;
	}
	/*Get methods for each of the instance variables.
    We can later put access modifiers to these get methods in order 
    to ensure data abstraction feature of Java */

    public String getName(){
    	return this.name;
    }
    public int getAge(){
    	return this.age;
    }
    public String getDesignation(){
    	return this.designation;
    }
    public double getSalary(){
    	return this.salary;
    }

}

public class EmployeeTest{
	public static void main(String [] args){
		System.out.println("Enter the name of the Employee:");
		Scanner s = new Scanner (System.in);
		String name = s.nextLine();
		Employee employee = new Employee(name);
		employee.setAge(56);
		System.out.println("Age of employee1 = " + employee.getAge());
		System.out.println("We havnt yet set the designation for employee one so on calling getDesignation, we get");
		System.out.println(employee.getDesignation());

	}
}
