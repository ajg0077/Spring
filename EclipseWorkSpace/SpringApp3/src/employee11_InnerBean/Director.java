package employee11_InnerBean;

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
