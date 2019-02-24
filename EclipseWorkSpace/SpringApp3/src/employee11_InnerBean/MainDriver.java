package employee11_InnerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring3.xml");
		Manager manager = context.getBean("manager", Manager.class);
		manager.address();
		
	}
}
