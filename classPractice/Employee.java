package classPractice;

import java.util.Scanner;

public class Employee {
	
	int salary;
	int hours;
	
	void getInfo(int salary, int hours) {

		this.salary = salary;
		this.hours = hours;
		printSalary();
	}
	
	void addSal() {
		
		if(salary <500)
			salary += 10;
	}
	
	void addWork() {
		
		if(hours > 6)
			salary += 5;
	}
	
	void printSalary() {
		
		addSal();
		addWork();
		System.out.println("Final salary of the employee is : $"+ salary);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.getInfo(400,7);
	}
}
