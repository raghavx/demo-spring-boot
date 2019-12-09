package com.raghavx.demo.spring.boot;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutPageRestController {

	@GetMapping("/about")
	public About about() {
		About a = new About();
		a.setName("About Page");
		a.setDob(new Date());
		a.setEmail("a@about.com");
		a.setPhone("1233214321");
		Address address = new Address();
		address.setStreetNumber("176");
		address.setStreetName("7th Street");
		address.setCityName("Lucknow");
		address.setStateName("UP");
		address.setCountryName("India");
		address.setPostalCode("226010");
		a.setAddress(address);
		
		return a;
	}
}
