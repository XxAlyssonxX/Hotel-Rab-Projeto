package com.yee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("classpath:/static/")
	public String home() {
		return "index.html";
	}

}