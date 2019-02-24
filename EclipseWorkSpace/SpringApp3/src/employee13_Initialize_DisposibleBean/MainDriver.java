package employee13_Initialize_DisposibleBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDriver {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring5.xml");
		Manager manager = context.getBean("aliasName", Manager.class);
		manager.address();
		
	}
}
