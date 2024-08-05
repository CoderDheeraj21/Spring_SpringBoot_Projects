package in.Dheeraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		BillCollector bc = context.getBean("billcollector", BillCollector.class);
		
		bc.collectPayment(1500.00);

		
	}
}
