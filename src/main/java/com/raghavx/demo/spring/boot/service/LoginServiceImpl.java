package com.raghavx.demo.spring.boot.service;

import org.springframework.stereotype.Service;

import com.raghavx.demo.spring.boot.model.AuthenticationResponse;
import com.raghavx.demo.spring.boot.model.LoginUserObject;

@Service
public class LoginServiceImpl implements LoginService{

	@Override
	public AuthenticationResponse auth(LoginUserObject luo) {
		AuthenticationResponse resp = new AuthenticationResponse();
		resp.setUserName(luo.getUserName());
		resp.setAuthenticated(false);
		resp.setMessage("Invalid username / password ");
		if("raghav".equals(luo.getUserName()) && 
				"password".equals(luo.getPassword())){
			System.out.println("User is authenticated ");
			resp.setAuthenticated(true);
			resp.setMessage("valid username / password ");
		}
		return resp;
	}

}
