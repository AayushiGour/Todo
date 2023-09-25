package com.myFirstWebApp.myFirstWebApplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean Authenticate(String username,String password) {
		
		boolean isValidUsername=username.equalsIgnoreCase("Aayushi Gour");
		boolean isValidPassword=password.equalsIgnoreCase("Aayu2511");
		
		
		return isValidUsername && isValidPassword;
	}
}
