package com.myFirstWebApp.myFirstWebApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerHello {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String syaHello() {
		return "Hello!! What are you learning today?";
	}
	
	/*@RequestMapping("say-hello-HTML")
	@ResponseBody
	public String syaHelloHTML() {
		
		StringBuffer sb=new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("My first HTML Page");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("This is HTML Body - With HTML Tags");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	/*@RequestMapping("say-hello-JSP")
	public String sayHelloJSP() {
		return "sayHello";
	}*/
}
