package in.Dheeraj.restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import in.Dheeraj.binding.Product;

@RestController
public class ProductController {

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		Product p1 = new Product(101, "TV", 1000.0);
		Product p2 = new Product(102, "Fridge", 20000.0);
		Product p3 = new Product(103, "Phone", 40000.0);
		Product p4 = new Product(104, "Washing Machine", 50000.0);
		
		List<Product> asList = Arrays.asList(p1, p2, p3, p4);
		
		return new ResponseEntity<List<Product>>(asList, HttpStatus.OK);
		
	}
}
