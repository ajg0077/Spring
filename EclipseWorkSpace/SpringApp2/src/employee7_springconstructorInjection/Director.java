package employee7_springconstructorInjection;

public class Director implements EmployeeAddress {

	private String city;
	
	public Director(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void address() {
		System.out.println("Address " + getCity());
	}

}
