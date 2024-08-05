package in.Dheeraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//By default the scope of beans is singleton, meaning it will only create one object per class.
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring_Beans.xml");
		
		// Both the objects will be having same hashcode because spring beans are singleton.
		// But if the scope is set to prototype then we will get different bean objects.
		// Note -- If the scope is set to prototype object will be created only when we say context.getBean() not by just launching the IOC.
		Motor m1 = context.getBean("motor", Motor.class);
		System.out.println(m1.hashCode());
		
		Motor m2 = context.getBean("motor", Motor.class);
		System.out.println(m2.hashCode());
		
		
	}
}
