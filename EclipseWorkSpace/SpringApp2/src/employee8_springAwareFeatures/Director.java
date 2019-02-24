package employee8_springAwareFeatures;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Director implements EmployeeAddress, ApplicationContextAware, BeanNameAware {

	private String city;
	private ApplicationContext context=null;
	
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

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context =context;
		Manager manager = context.getBean("manager", Manager.class);
		System.out.println("Context inside Director class");
		manager.address();
	}

	@Override
	public void setBeanName(String bean) {
		System.out.println("Name of Bean"+ bean);
	}

}
