package in.Dheeraj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Employee_Details")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {

	@Id
	@Column(name="employee_id")
	private Integer empId;
	
	@Column(name="employee_name")
	private String epmName;
	
	@Column(name="employee_age")
	private Integer empAge;
	
	@Column(name="employee_gender")
	private String empGender;
	
	@Column(name="employee_country")
	private String empCountry;
}
