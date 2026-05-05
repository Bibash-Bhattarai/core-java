package oops;

public class Test {

	
	public static void main(String[] args) {
		
		Book b = new Book();
		
		b.id = 203;
		b.name = "Math";
		b.author = "Hari Krishna";
		b.price = 800;
		
		System.out.println("About book:");
		b.printBook();
		
		Car c = new Car();
		
		c.model = "m34d";
		c.brandName = "Ford";
		c.color = "red";
		c.price = 798000;
		
		System.out.println("\nAbout car:");
		c.printCar();
		
		Student s = new Student();
		
		s.stdId = 2279638;
		s.stdName = "Bibash Bhattarai";
		s.schoolName = "Madan Bhandari Memorial College";
		s.batch ="2079";
		s.faculty = "IT";
		
		System.out.println("\nAbout Student:");
		s.printStudent();
		
		Pen p = new Pen();
		
		p.bName = "Tecno Tip";
		p.color = "Black";
		p.price = 20;
		
		System.out.println("\nAbout Pen: ");
		p.printPen();
	}
}
