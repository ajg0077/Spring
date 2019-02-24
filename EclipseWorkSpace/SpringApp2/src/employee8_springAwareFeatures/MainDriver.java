package employee8_springAwareFeatures;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring3.xml");
		
		Director director = context.getBean("directorA", Director.class);
		director.address();
	}
}
