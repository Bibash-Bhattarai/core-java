package encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		c.setId(3434);
		c.setName("Hari Sham");
		c.setPhone("9856747372");
		c.setAge(23);
		
//		System.out.println("Id = "+ c.getId());
//		System.out.println("Name = "+ c.getName());
//		System.out.println("Phone = "+ c.getPhone());
//		System.out.println("Age = "+ c.getAge());
		
		System.out.println(c);
	}
}
