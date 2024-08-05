package in.Dheeraj.service;

import java.util.List;

import in.Dheeraj.entity.Book;

public interface BookService {
	
	public String upsert(Book book);
	
	public String deleteByID(Integer bookId);
	
	public List<Book> getAllBooks();
	

}
