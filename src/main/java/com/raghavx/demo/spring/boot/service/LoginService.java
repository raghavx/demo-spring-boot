package com.raghavx.demo.spring.boot.service;

import com.raghavx.demo.spring.boot.model.AuthenticationResponse;
import com.raghavx.demo.spring.boot.model.LoginUserObject;

public interface LoginService {

	AuthenticationResponse auth(LoginUserObject luo);
}
