package in.Dheeraj.bean;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {
	public Engine() {
		System.out.println("Engine : : Constructor called");
	}
	
	//After object creation do something
	@PostConstruct
	public void intit() {
		System.out.println("start engine...");
	}
	
	//Before object destruction do something
	@PreDestroy
	public void distroy() {
		System.out.println("stop engine...");
	}
	
	//Note - This approach is recommended as we are not forced to implement any interface.
	
}
