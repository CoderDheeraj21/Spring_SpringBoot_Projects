package in.Dheeraj;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dheeraj.entity.Employee;
import in.Dheeraj.repository.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmployeeRepo repo = context.getBean(EmployeeRepo.class);
		
		Employee e1 = new Employee(101, "Dheeraj", 23, "Male", "India");
		Employee e2 = new Employee(102, "Adesh", 24, "Male", "India");
		Employee e3 = new Employee(103, "Shiva", 25, "Male", "Usa");
		Employee e4 = new Employee(104, "Sanjay", 26, "Male", "Germany");
		Employee e5 = new Employee(105 , "Ruta", 23, "Female", "Canada");
		
//		repo.saveAll(Arrays.asList(e1, e2, e3, e4));
		repo.save(e5);
		
		
		/*
		 * List<Employee> byEmpCountry = repo.findByEmpCountry("India");
		 * byEmpCountry.forEach(user->{ System.out.println(user); });
		 */
		
		
		/*
		 * List<Employee> byEmpAge = repo.findByEmpAge(23); byEmpAge.forEach(user->{
		 * System.out.println(user); });
		 */
		
		/*
		 * List<Employee> byEmpAgeGreaterThanEqual =
		 * repo.findByEmpAgeGreaterThanEqual(24);
		 * byEmpAgeGreaterThanEqual.forEach(user->{ System.out.println(user); });
		 */
		
		/*
		 * List<Employee> byEmpCountryIn =
		 * repo.findByEmpCountryIn(Arrays.asList("India", "Usa"));
		 * byEmpCountryIn.forEach(user->{ System.out.println(user); });
		 */
		
		List<Employee> byEmpCountryAndAge = repo.findByEmpCountryAndAge("India", 24);
		byEmpCountryAndAge.forEach(user->{
			System.out.println(user);
		});
	}

}
