package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	@RequestMapping("/courses")
	public String coures() {
		System.out.println("Wel-come to Bridgelabz");
		return "Coureses.jsp";
	}
}
