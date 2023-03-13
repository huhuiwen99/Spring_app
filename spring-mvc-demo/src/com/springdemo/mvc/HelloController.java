package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	// add a controller method to show the initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-form";
	}
	
	// a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello";
	}
	
	// new a controller method to read form data 
	// and add the data to the model.
	@RequestMapping("/processFormTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request from the HTML form
		String theName = request.getParameter("studentName");
		
		// covert data to upper
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo!" + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "hello";
	}
	

}
