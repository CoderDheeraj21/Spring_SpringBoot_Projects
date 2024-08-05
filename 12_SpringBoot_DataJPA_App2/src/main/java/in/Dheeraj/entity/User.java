package in.Dheeraj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="User_Master")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@Column(name="User_Id")
	private Integer userId;
	
	@Column(name="User_Name")
	private String userName;
	
	@Column(name="User_Age")
	private Integer userAge;
	
	@Column(name="User_Gender")
	private String gender;
	
	@Column(name="User_Country")
	private String country;

}
