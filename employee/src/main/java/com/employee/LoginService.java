package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	LoginDao ldao;
	public String addDetails(String pwd) throws PasswordException {
		// TODO Auto-generated method stub
		
			if (pwd.length() > 8) {
				return "login successfully.";
			} else {
				throw new PasswordException("Passsword not correct");
			}
	}
}
