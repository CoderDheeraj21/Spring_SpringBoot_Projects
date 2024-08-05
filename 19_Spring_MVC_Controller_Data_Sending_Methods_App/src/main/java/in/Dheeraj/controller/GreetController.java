package in.Dheeraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {

	@GetMapping("/greet")
	@ResponseBody
	public String getGreetMessage() {
		return "Good Morning";
	}
}
