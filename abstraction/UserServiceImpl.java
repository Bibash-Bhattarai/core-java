package abstraction;

public class UserServiceImpl implements UserService, CommonService{

	@Override
	public void addUser() {
		System.out.println("added success");
		
	}

	@Override
	public void deleteUser() {
		
		System.out.println("deleted success");
	}

	@Override
	public void print() {
		
		System.out.println("--------- printing ------");
		
	}
	
	

}
