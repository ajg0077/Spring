package employee3_tightcoupling;

public class MainDriver {
	public static void main(String[] args) {
		Address address = null;
		
		EmployeeAddress manager = new Manager(address);
		manager.address();
		
		EmployeeAddress director = new Director(address);
		director.address();
	}
}
