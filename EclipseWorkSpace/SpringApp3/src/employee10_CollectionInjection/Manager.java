package employee10_CollectionInjection;

public class Manager implements EmployeeAddress {

	private Address addressa;
	private Address addressb;
	private Address addressc;

	public Address getAddressa() {
		return addressa;
	}

	public void setAddressa(Address addressa) {
		this.addressa = addressa;
	}

	public Address getAddressb() {
		return addressb;
	}

	public void setAddressb(Address addressb) {
		this.addressb = addressb;
	}

	public Address getAddressc() {
		return addressc;
	}

	public void setAddressc(Address addressc) {
		this.addressc = addressc;
	}

	@Override
	public void address() {
		System.out.println("Address A =" + getAddressa().getCity() + " " + getAddressa().gethNo());
		System.out.println("Address B =" + getAddressb().getCity() + " " + getAddressb().gethNo());
		System.out.println("Address C =" + getAddressc().getCity() + " " + getAddressc().gethNo());
	}

}
