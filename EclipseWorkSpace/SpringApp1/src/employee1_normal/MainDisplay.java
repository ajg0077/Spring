package employee1_normal;

public class MainDisplay {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setCity("Trivandrum");
		manager.address();
		
		Director director = new Director();
		director.setCity("Kochi");
		director.address();
	}
}
