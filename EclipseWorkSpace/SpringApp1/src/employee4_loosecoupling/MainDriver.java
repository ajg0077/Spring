package employee4_loosecoupling;

public class MainDriver {
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Hello");
		address.sethNo(123);
		EmployeeAddress manager = new Manager(address);
		manager.address();
		
		EmployeeAddress director = new Director(address);
		director.address();
	}
}
