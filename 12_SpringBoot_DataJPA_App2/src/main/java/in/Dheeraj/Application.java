package in.Dheeraj;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dheeraj.entity.User;
import in.Dheeraj.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		UserRepository repo = context.getBean(UserRepository.class);
		
		User u1 = new User(101, "Dheeraj", 23, "Male", "India");
		
		//repo.save(u1); for inserting single data into table
		
		User u2 = new User(102, "Adesh", 24, "Male", "India");
		User u3 = new User(103, "Vishal", 24, "Male", "USA");
		User u4 = new User(104, "Shiva", 25, "Male", "Canada");
		
		//repo.saveAll(Arrays.asList(u2, u3, u4)); for inserting multiple data into table
		
		
		/*
		 * Optional<User> byId = repo.findById(101); if(byId.isPresent()) {
		 * System.out.println(byId.get()); }   
		 */
		
		/*
		 * Iterable<User> findAllById = repo.findAllById(Arrays.asList(101, 102, 103,
		 * 104)); findAllById.forEach(user ->{ System.out.println(user); });   
		 */
		
		/*
		 * Iterable<User> findAll = repo.findAll(); findAll.forEach(user->{
		 * System.out.println(user); });
		 */
		
		/*
		 * long count = repo.count(); //To find number of records present in the table.
		 * System.out.println(count);
		 * 
		 * boolean existsById = repo.existsById(101);
		 * System.out.println("Record present in the table with id 101: "+existsById);
		 */
		
		
		repo.deleteById(104);
		
		repo.deleteAllById(Arrays.asList(102, 103));
		
	}

}
