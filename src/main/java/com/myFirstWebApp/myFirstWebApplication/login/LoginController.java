package com.myFirstWebApp.myFirstWebApplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("name")
@Controller
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="login",method=RequestMethod.GET)
	public String GoToLoginPage() {
		
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String GoToWelcomePage(@RequestParam String name,@RequestParam String password , ModelMap model) {
		
		if(authenticationService.Authenticate(name,password))
		{
			model.put("name", name);
			
			return "Welcome";
		}
		model.put("errorMessage", "Invalid Credentials . Please Try Again !!");
		return "login";
	}
}
