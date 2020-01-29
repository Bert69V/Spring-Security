package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	@GetMapping("/")
    public String shield() {
        return "Welcome to the SHIELD!";
    }
	
	@GetMapping("/secret-bases")
	public String secretbases() {
	    return "Darmstadt, Bonn, Paris, Dublin";
	}
	
	@GetMapping("/avengers/assemble")
	public String avengers() {
		return "Avengers..... Assemble";
	}
}	

	
	

