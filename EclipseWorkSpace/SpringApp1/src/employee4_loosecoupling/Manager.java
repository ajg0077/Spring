package employee4_loosecoupling;

public class Manager implements EmployeeAddress {

	private Address address;

	public Manager(Address address) {
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
