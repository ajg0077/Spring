package employee2_interface;

public class Manager implements EmployeeAddress{

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public Manager(String city) {
		super();
		this.city = city;
	}

	@Override
	public void address() {
		System.out.println("Address "+getCity());
	}
}
