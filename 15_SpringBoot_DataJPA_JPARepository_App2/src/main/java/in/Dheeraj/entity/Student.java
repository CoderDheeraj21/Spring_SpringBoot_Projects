package in.Dheeraj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Student_Info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	private Integer stdID;
	
	private String stdName;
	
	private Integer stdAge;
	
	private String stdGender;
	
	private String stdLocation;
	

}
