package com.xworkz.hema;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ProtestConController {
	
	public ProtestConController() {
		System.out.println("created \t" +this.getClass().getSimpleName());
	}
	
	@RequestMapping("/apply.do")
	public String onApply(HttpServletRequest req) {
		
	System.out.println("invoked onApply");
	
	String organization=req.getParameter("Organization");
	System.out.println("organization");
	
	System.out.println("organization");
	
	String reason=req.getParameter("Reason");
	System.out.println("reason");
	
	String date=req.getParameter("Date");
	System.out.println("date");
	
	String location=req.getParameter("Location");
	System.out.println("location");
	
	req.setAttribute("Reason", reason);
	return "/success.jsp";
		
	}

}
