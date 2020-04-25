package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	@RequestMapping("courses")
	public String coures(String cname,HttpSession session) {
		session.setAttribute("cname", cname);
		return "Coureses";
	}
}
