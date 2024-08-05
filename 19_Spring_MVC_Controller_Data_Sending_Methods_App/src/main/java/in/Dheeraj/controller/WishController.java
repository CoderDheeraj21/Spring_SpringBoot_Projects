package in.Dheeraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishController {
	
	@GetMapping("/wish")
	public String getWishMessage(Model model) {
		model.addAttribute("msg", "All The Best");
		return "wish";
	}
}
