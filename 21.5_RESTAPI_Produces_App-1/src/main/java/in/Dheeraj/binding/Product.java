package in.Dheeraj.binding;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;


@Data
@XmlRootElement
public class Product {

	private Integer id;
	
	private String name;
	
	private Double price;
}
