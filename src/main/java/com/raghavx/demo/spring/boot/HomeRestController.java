package com.raghavx.demo.spring.boot;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

	@GetMapping("/")
	public String home() {
		return "This is my home page";
	}
	
}
