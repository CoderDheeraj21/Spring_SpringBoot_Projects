package in.Dheeraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.Dheeraj.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public String getBookData(Model model) {
		Book obj1 = new Book(101, "SpringBoot", 4500.0);
		model.addAttribute("book", obj1);
		return "book";
	}

}
