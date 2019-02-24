package employee13_Initialize_DisposibleBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Manager implements EmployeeAddress, InitializingBean, DisposableBean {

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

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean Destryoing");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Bean");
	}

}
