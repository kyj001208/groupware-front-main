package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
	
	@GetMapping("/p-main")
	public String main() {
		return "/p-main.html";
	}
	

}
