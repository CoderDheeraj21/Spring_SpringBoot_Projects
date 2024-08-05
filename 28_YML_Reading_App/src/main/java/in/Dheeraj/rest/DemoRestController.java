package in.Dheeraj.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Dheeraj.props.ApplicationProperties;

@RestController
public class DemoRestController {

	@Autowired
	private ApplicationProperties props;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		Map<String, String> messages = props.getMessages();
		String msg = messages.get("welcomeMsg");
		return msg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		Map<String, String> messages = props.getMessages();
		String msg = messages.get("greetMsg");
		return msg;
	}
	
	@GetMapping("/wish")
	public String getWishMessage() {
		return props.getMessages().get("wishMsg");
	}
}
