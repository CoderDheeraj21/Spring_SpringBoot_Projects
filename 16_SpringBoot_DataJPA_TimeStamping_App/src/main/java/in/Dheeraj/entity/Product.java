package in.Dheeraj.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	
	@Id
	private Integer pid;
	
	private String pname;
	
	private Double price;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE", updatable = false)
	private LocalDate createDate;  //We can also display time if we give data type as LocatDateTime
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE", insertable = false)
	private LocalDate updateDate;

}
