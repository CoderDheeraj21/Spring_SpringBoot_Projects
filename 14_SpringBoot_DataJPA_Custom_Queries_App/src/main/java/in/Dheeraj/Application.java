package in.Dheeraj;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Dheeraj.entity.Student;
import in.Dheeraj.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepository repo = context.getBean(StudentRepository.class);

		
		/*
		 * Student std1 = new Student(101, "Dheeraj", 23, "Male", "Pune");
		 * 
		 * Student std2 = new Student(102, "Adesh", 23, "Male", "Katraj");
		 * 
		 * Student std3 = new Student(103, "Sanjay", 23, "Male", "Hinjewadi");
		 * 
		 * Student std4 = new Student(104, "Shiva", 23, "Male", "Malshiras");
		 * 
		 * repo.saveAll(Arrays.asList(std1, std2, std3, std4));
		 */
		 

			
		/*
		 * List<Student> allStudents = repo.getAllStudents(); allStudents.forEach(std ->
		 * { System.out.println(std); });
		 * 
		 * System.out.println("####################");
		 * 
		 * List<Student> allStudentsByLocation = repo.getAllStudentsByLocation("Pune");
		 * allStudentsByLocation.forEach(std->{ System.out.println(std); });
		 * 
		 * System.out.println("######################");
		 * 
		 * List<Student> allStudentsByLocationAndAge =
		 * repo.getAllStudentsByLocationAndAge("Pune", 23);
		 * allStudentsByLocationAndAge.forEach(std->{ System.out.println(std); });
		 */
		
		
		List<Student> allStudentsSql = repo.getAllStudentsSql();
		
		allStudentsSql.forEach(std->{
			System.out.println(std);
		});
			  
		System.out.println("#################");
		
		
		List<Student> allStudnetByLocationAndAgeSql = repo.getAllStudnetByLocationAndAgeSql("Hinjewadi", 23);
		allStudnetByLocationAndAgeSql.forEach(std->{
			System.out.println(std);
		});
	}

}
