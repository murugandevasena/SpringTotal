package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="emp")
public class LoginController {
	@Autowired
	LoginService ls ;
	
	@PostMapping(value ="/addDetails/{pwd}")
	public String addDetails(@PathVariable String pwd) throws PasswordException {
		return ls.addDetails(pwd);
		
	}
	
	

}
