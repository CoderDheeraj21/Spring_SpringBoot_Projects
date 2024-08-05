package in.Dheeraj.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Motor implements InitializingBean, DisposableBean{
	
	public Motor() {
		System.out.println("Motor : : Constructor called");
	}
	
	//If we want to perform something after object creation and before object destruction then we should go for this bean life cycle method.
	//After Object creation do something
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("afterPropertiesSet() method called");
		
	}

	//Before Object destruction do something
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method called");
		
	}

	
	//Note above approach is not recommended cause it is forcing us to use or implement this interfaces.

	
	
}
