package employee4_loosecoupling;

public class Director implements EmployeeAddress {

	private Address address;

	public Director(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public void address() {
		System.out.println("Address =" + getAddress().getCity() + " " + getAddress().gethNo());
	}

}
