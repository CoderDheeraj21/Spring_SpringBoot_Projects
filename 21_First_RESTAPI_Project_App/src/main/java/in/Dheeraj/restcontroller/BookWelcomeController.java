package in.Dheeraj.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookWelcomeController {
	
	
	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable String name){
		String responseBody = name+" book price is 400$";
		return new ResponseEntity<>(responseBody, HttpStatus.OK);
		
	}
	
	@GetMapping("/book/{name}/{author}")
	public ResponseEntity<String> getBook(@PathVariable("name") String name, @PathVariable(value="author")String author){
		String responseBody = name+" by "+author+" is out of stcok"; 
		return new ResponseEntity<>(responseBody, HttpStatus.OK);
	}
}
