package constructor;

public class User {

	String username;
	String password;
	
	// default constructor
	User(){
		username = "root";
		password = "123";
	}
	
	// parameterize constructor
	User(String username, String password){
		
		this.username = username;
		this.password = password;
	}
	void printUser() {
		
		System.out.println("UserName = "+ username);
		System.out.println("Password = "+ password);
	}
	
	public static void main(String[] args) {
		
		User u = new User("bibash","bib123");
		u.printUser();
	}
}
