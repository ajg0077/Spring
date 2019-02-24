package employee10_CollectionInjection2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring2.xml");
		Manager manager = context.getBean("manager", Manager.class);
		manager.address();
		
	}
}
