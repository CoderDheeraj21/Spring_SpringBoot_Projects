package in.Dheeraj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Dheeraj.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApiClient webClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String greetMsg = "Good Morning";
		
		String welcomeMsg = webClient.invokeWelcomeApi();
		
		return greetMsg + welcomeMsg;
	}
}
