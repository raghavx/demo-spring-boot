package com.raghavx.demo.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raghavx.demo.spring.boot.model.AuthenticationResponse;
import com.raghavx.demo.spring.boot.model.LoginUserObject;
import com.raghavx.demo.spring.boot.service.LoginService;

@RestController
public class LoginController {
	/**
	 * Create a user class
	 * 
	 * Send the user as json payload
	 * 
	 * create a mapping for the login
	 */
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/login")
	public LoginUserObject getUser() {
		LoginUserObject user = new LoginUserObject();
		return user;
	}
	
	@PostMapping("/login")
	public AuthenticationResponse setUser(@RequestBody LoginUserObject luo) {
		return loginService.auth(luo);
	}

}

