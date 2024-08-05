package in.Dheeraj.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;
	
	private Author author;
	
}
