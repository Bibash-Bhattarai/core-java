package inheritancePractice;

public class Rectangle {

	int length, breadth;
	
	Rectangle(int length, int breadth){
		
		this.length = length;
		this.breadth = breadth;
	}
	
	void area() {
		
		int area = length * breadth;
		System.out.println("Area : "+ area);
	}
	
	void perimeter() {
		
		int peri = 2 * (length + breadth);
		System.out.println("Perimeter : "+ peri);
	}
}
