package in.Dheeraj.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.Dheeraj.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee , Integer>{

	//Select query to find record of employee by country
	public List<Employee> findByEmpCountry(String country);
	
	//Select query to find record of employee by age
	public List<Employee> findByEmpAge(Integer age);
	
	//Select query to find record of employee whose age is greater than or equal to some age.
	public List<Employee> findByEmpAgeGreaterThanEqual(Integer age);
	
	////Select query to find record of employee whose country are between the countries which are passed
	public List<Employee> findByEmpCountryIn(List<String> countries);

	public List<Employee> findByEmpCountryAndAge(String country, Integer age);

}
