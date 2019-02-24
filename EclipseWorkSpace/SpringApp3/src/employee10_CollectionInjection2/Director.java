package employee10_CollectionInjection2;

public class Director implements EmployeeAddress {

private String city;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void address() {
		System.out.println("Address "+getCity());
	}

}
