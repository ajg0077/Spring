package employee5_springloosecoupling;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MainDriver {
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		Manager manager = factory.getBean("manager", Manager.class);
		manager.address();
		
	}
}
