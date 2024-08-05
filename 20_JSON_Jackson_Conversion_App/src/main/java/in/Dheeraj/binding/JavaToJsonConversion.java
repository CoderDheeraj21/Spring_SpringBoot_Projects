package in.Dheeraj.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConversion {

	public static void main(String[] args) throws Exception{
		
		Author author = new Author();
		author.setAuthorName("Dheeraj");
		author.setAuthorEmail("dhirajchatur.21@gmail.com");
		author.setAuthorPhone(12345);
		
		
		Book book = new Book();
		book.setBookId(101);
		book.setBookName("Spring Boot");
		book.setBookPrice(4000.0);
		book.setAuthor(author);
	
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("Book.json"), book);
		System.out.println("Coversion Completed....");
	}
}
