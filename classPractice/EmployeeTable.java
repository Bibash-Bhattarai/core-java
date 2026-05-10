package classPractice;

import java.util.Scanner;

public class EmployeeTable {

	String name;
	int yoj;
	String address;
	
	void display() {

		
		System.out.println(name+"       "+yoj+"          "+address);
	}
	public static void main(String[] args) {
		System.out.println("Name   "+"Year of Joining "+"  Address");

		EmployeeTable et1 = new EmployeeTable();
		
		et1.name = "Robert";
		et1.yoj = 1994;
		et1.address="64C- WallsStreat";
		
		et1.display();
		
		EmployeeTable et2 = new EmployeeTable();
				
				et2.name = "Sam";
				et2.yoj = 2000;
				et2.address="648D- WallsStreat";
				
				et2.display();
		
		EmployeeTable et3 = new EmployeeTable();
				
				et3.name = "John";
				et3.yoj = 1999;
				et3.address="26B- WallsStreat";
	
		et3.display();
	}
}
