package com.example.webApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView welcome(@RequestParam(name="name",required = true) String name) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("welcome");
		return mv;
		
	}
}
