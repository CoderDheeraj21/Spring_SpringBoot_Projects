package in.Dheeraj.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Value("${messages.welcome}")
	String welcomeMsg;
	
	@Value("${messages.greet}")
	String greetMsg;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return welcomeMsg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return greetMsg;
	}
	
}
