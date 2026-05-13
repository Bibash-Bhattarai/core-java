package inheritancePractice;

public class Test {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.printParent();
		
		Child c = new Child();
		c.print();
		
		c.printParent();
		
	}
}
