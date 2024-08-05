package in.Dheeraj;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

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
		 * Student std2 = new Student(102, "Adesh", 24, "Male", "Katraj");
		 * 
		 * Student std3 = new Student(103, "Shiva", 25, "Male", "Hinjewadi");
		 * 
		 * Student std4 = new Student(104, "Sanjay", 26, "Male", "Pune");
		 * 
		 * Student std5 = new Student(105, "Amit", 27, "Male", "Baner");
		 * 
		 * Student std6 = new Student(106, "Suraj", 23, "Male", "Malshiras");
		 * 
		 * Student std7 = new Student(107, "Vishal", 29, "Male", "Kolhapur");
		 * 
		 * repo.saveAll(Arrays.asList(std1, std2, std3, std4, std5, std6, std7));
		 */	
		
		/*
		 * Student std8 = new Student(108, "Sakshi", 21, "FeMale", "Natepute");
		 * 
		 * Student std9 = new Student(109, "Shivani", 30, "FeMale", "Mumbai");
		 * 
		 * Student std10 = new Student(110, "Aradhya", 29, "FeMale", "Nashik");
		 * 
		 * repo.saveAll(Arrays.asList(std8, std9, std10));
		 */
		
		/*
		 * List<Student> all = repo.findAll(Sort.by("stdName")); all.forEach(std->{
		 * System.out.println(std); });
		 */
		
		PageRequest pageRequest = PageRequest.of(1, 3);
		Page<Student> pageData = repo.findAll(pageRequest);
		List<Student> content = pageData.getContent();
		content.forEach(std->{
			System.out.println(std);
		});

	}

}
