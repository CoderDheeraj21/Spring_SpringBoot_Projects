package in.Dheeraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Bean.xml");
		Car car = context.getBean("car", Car.class);
		car.drive();
	}
}
