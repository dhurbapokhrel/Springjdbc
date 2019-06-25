package com.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignUpController {
	
	@RequestMapping(value ="signup", method= RequestMethod.GET)
	
	public void signup(){
		System.out.println("I am being called from Sign Up");
		
	}

}
