package in.Dheeraj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dheeraj.entity.Product;
import in.Dheeraj.repo.ProductRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepo repo = context.getBean(ProductRepo.class);
		
		Product p1 = new Product();
		p1.setPid(101);
		p1.setPname("Laptop");
		p1.setPrice(12000.0);
		
		repo.save(p1);
	}

}
