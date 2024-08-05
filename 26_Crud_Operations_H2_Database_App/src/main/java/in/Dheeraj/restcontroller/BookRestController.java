package in.Dheeraj.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Dheeraj.entity.Book;
import in.Dheeraj.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	BookService bookService;
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		String msg = bookService.upsert(book);

		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks(){
		List<Book> allBooks = bookService.getAllBooks();
		return new ResponseEntity<List<Book>>(allBooks, HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		String msg = bookService.upsert(book);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer bookId){
		String msg = bookService.deleteByID(bookId);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
