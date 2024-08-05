package in.Dheeraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		
		
		mav.addObject("msg", "Welcome to India"); //This is model
		//In here we are saying say that model message should be displayed in view that index file
		mav.setViewName("index");//This is view
		
		return mav;
	}
}
