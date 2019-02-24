package employee2_interface;

public class MainDisplay {

	public static void main(String[] args) {
		EmployeeAddress manager = new Manager("Trivandrum");
		manager.address();
		
		EmployeeAddress director = new Director("Kochi");
		director.address();
	}
}
