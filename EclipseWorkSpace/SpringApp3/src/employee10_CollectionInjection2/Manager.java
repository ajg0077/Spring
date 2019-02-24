package employee10_CollectionInjection2;

import java.util.List;

public class Manager implements EmployeeAddress {
	private List<Address> address;

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public void address() {
		for(Address a: address) {
			System.out.println(a.getCity()+ " " + a.gethNo());
		}
	}

}
