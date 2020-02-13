package com.xworkz.hema;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CountryController {
	
	public CountryController() {
		System.out.println("creted /t"+this.getClass().getSimpleName());
	}

	@RequestMapping("/con.do")	
	public String OnApply(HttpServletRequest req) {
		System.out.println("invoked apply");
		
		String msg=req.getParameter("message");
		System.out.println("Message:"+msg);
		
		String email =req.getParameter("email");
		System.out.println("Email:"+email);
		
		String file=req.getParameter("file");
		System.out.println("File Details:"+file);
		
		return "/Country1.jsp";

}
}
