package arrayofobject;

import java.util.Scanner;

public class EmployeesTest {

	public static void main(String[] args) {
		
		Employees emp[] = new Employees[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<emp.length; i++) {
			
			Employees e = new Employees();
			
			System.out.println("Enter Id:");
			e.setId(sc.nextInt());
			
			System.out.println("Enter Name:");
			e.setName(sc.next());
			
			System.out.println("Enter Company:");
			e.setCompany(sc.next());
			
			System.out.println("Enter Salary:");
			e.setSalary(sc.nextDouble());
			
			System.out.println("Enter Department:");
			e.setDepartment(sc.next());
			
			System.out.println("Enter Post:");
			e.setPost(sc.next());
			
			System.out.println("Enter city:");
			e.setCity(sc.next());
			
			emp[i] = e;
			
		}
		
		double ts = 0;
		int count1 = 0;
		for(Employees e : emp) {
			
			System.out.println(e);
		
			ts = ts + e.getSalary();
			
			if(e.getDepartment().equals("admin"))
				count1++;
		}
		
		System.out.println("Total salary is: "+ ts);
		System.out.println("Total employee in Admin Department:"+ count1);
		
		double td=0;
		System.out.println("Employee of IT department:");
		for(Employees e : emp) {
			if(e.getDepartment().equals("it")) {
				System.out.println(e);
				td = td + e.getSalary();
			}
		}
		System.out.println("Total salary of it department: "+ td);
		
		int count2=0;
		System.out.println("Employee from ktm:");
		for(Employees e: emp) {
			if(e.getCity().equals("ktm")) {
				System.out.println(e);
				count2++;
			}
		}
		System.out.println("Total employee from ktm: "+ count2);
		
		double min=0,max=0;
		for(Employees e : emp) {
			
			if(min == 0 || max == 0) {
				min = e.getSalary();
				max = e.getSalary();
			}
			if(e.getSalary()<min)
				min = e.getSalary();
			
			if(e.getSalary()> max)
				max = e.getSalary();
		}
		System.out.println("Lowest salary of employee is : "+ min);
		System.out.println("Highest salary of employee is : "+ max);
		
	}
	
}
