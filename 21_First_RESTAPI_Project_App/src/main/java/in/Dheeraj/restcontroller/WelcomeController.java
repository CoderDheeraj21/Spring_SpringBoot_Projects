package in.Dheeraj.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	//This approach is used to create our own http response status code and is recommended to use.
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMessage(){
		String responseBody = "Welcome to Dheeraj IT";
		
		return new ResponseEntity<>(responseBody, HttpStatus.OK);
		
	}
	
	@GetMapping("/wish")
	public ResponseEntity<String> getWishMessage(@RequestParam("name") String name){
		String responseBody = name+", Welcome to Dheeraj IT";
		
		return new ResponseEntity<>(responseBody, HttpStatus.OK);
		
				
	}
	
	@GetMapping("/greet")
	public String getGreetMessage() {
		return "Good Morning...";
	}

}
