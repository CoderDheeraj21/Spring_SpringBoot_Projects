package in.Dheeraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Dheeraj.dao.BookRepo;
import in.Dheeraj.entity.Book;

@Service
public class BookServiceImp implements BookService{
	
	BookRepo bookRepo;
	
	@Autowired
	public void setBookRepo(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public String upsert(Book book) {
		Integer bookId = book.getBookId();
		boolean exists = bookId != null && bookRepo.existsById(bookId);
		
		bookRepo.save(book);
		
		if (exists) {
			return "Record Updated Successfully";
		} else {
			return "Inserted Successfully";
		}
		
	}

	@Override
	public String deleteByID(Integer bookId) {
		
		bookRepo.deleteById(bookId);

		return "Deleted Successfully";
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookRepo.findAll();
	}
	
	

}
