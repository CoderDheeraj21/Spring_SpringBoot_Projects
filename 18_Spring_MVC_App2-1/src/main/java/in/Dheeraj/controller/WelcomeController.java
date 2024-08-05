package in.Dheeraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Spring Boot");
		mav.setViewName("welcome");
		
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetingsMessage() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Good Morning");
		
		mav.setViewName("greet");
		
		return mav;
	}
	
	@GetMapping("/wish")
	public ModelAndView getWishMessage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "All The Best");
		mav.setViewName("wish");
		return mav;
	}
}
