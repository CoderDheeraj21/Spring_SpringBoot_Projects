package in.Dheeraj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.Dheeraj.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

		//These below are HQL Queries
		@Query(value="From Student")
		public List<Student> getAllStudents();
		
		 @Query(value="From Student where stdLocation =:lname") 
		 public List<Student> getAllStudentsByLocation(String lname);
		 
		 @Query(value="From Student where stdLocation=:lname and stdAge = :age")
		 public List<Student> getAllStudentsByLocationAndAge(String lname ,Integer age);
		   
		 //This below are Native SQL Queries
		 @Query(value="select * from student_info", nativeQuery = true)
		 public List<Student> getAllStudentsSql();
		 
		 @Query(value="select * from student_info where std_location=:location and std_age=:age", nativeQuery = true)
		 public List<Student> getAllStudnetByLocationAndAgeSql(String location, Integer age);
}
