package employee7_springconstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {
	private static AbstractApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("Spring2.xml");
		
		Director director = (Director) context.getBean(Director.class);
		director.address();
		
		
	}
}
