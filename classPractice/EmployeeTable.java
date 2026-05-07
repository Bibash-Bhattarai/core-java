package classPractice;

import java.util.Scanner;

public class EmployeeTable {

	String name;
	int yoj;
	String address;
	int count =0;
	
void title() {
	System.out.print("Name		"+"Year of Joining "+"Address");
}
	void display() {
		
		System.out.println(name+"   "+yoj+"      "+address);
	}
}
