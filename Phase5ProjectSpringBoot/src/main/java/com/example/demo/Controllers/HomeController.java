package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "Index";
	}
	@RequestMapping("/quiz")
	public String quiz() {
		return "Quiz";
}
}