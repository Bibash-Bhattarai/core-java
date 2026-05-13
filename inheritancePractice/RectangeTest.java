package inheritancePractice;

public class RectangeTest {

	public static void main(String[] args) {
		
		
		System.out.println("Rectangle:");
		Rectangle rect = new Rectangle(10,5);
		rect.area();
		rect.perimeter();

		Square sq[] = new Square[10];
		
		for(int i=0; i<10; i++) {
			sq[i] = new Square(i + 1);
		}
		
		System.out.println("Area of 10 square:");
		
		for(int i = 0; i<10; i++) {
			System.out.print("Square "+(i+1)+" :");
			sq[i].area();
		}
				
	}
}
