package aggregation;

public class Test {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		
		b.setColor("Red");
		b.setCompany("Bajaj");
		b.setPrice(340000);
		
		Student s = new Student();
		
		s.setId(12);
		s.setName("Bibash");
		s.setCollege("Madan Bhandari");
		s.setBike(b);
		
		System.out.println("Id = "+ s.getId());
		System.out.println("Name = "+ s.getName());
		System.out.println("College = "+ s.getCollege());
		System.out.println("----------- bike Info------");
		System.out.println("Color = "+s.getBike().getColor());
		System.out.println("Company = "+ s.getBike().getCompany());
		System.out.println("Price = "+ s.getBike().getPrice());
	}
}
