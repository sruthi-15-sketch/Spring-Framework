package com.example.demo.homecontroller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return  "Hello visitor!";
	}

}


