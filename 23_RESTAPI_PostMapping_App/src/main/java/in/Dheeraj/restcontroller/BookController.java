package in.Dheeraj.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Dheeraj.binding.Book;

@RestController
public class BookController {

	@PostMapping(
			value = "/book",
			consumes = {"application/xml", "application/json"} //This is to specify that our method can accept both xml and json type body data.
			)  
	public ResponseEntity<String> addBook(@RequestBody Book book){
		//some logic
		
		String msg = "Book Added Succesfully";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
