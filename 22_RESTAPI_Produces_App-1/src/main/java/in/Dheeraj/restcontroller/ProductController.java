package in.Dheeraj.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.Dheeraj.binding.Product;

@RestController
public class ProductController {

	@GetMapping(
			value="/product",
			produces = {"application/xml", "application/json"}
			)
	public ResponseEntity<Product> getProduct(){
		Product productObject = new Product();
		productObject.setId(101);
		productObject.setName("Iphone");
		productObject.setPrice(100000.0);
		
		return new ResponseEntity<Product>(productObject, HttpStatus.OK);
	}
}
