package employee9_BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring4.xml");
		Manager manager = context.getBean("manager", Manager.class);
		manager.address();
		
		Director director = context.getBean("director", Director.class);
		director.address();
	}
}
