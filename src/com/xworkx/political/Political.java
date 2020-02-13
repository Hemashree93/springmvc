package com.xworkx.political;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Component
@RequestMapping("/")
public class Political {
	
	public Political() {
	System.out.println("created \t"+this.getClass().getSimpleName());
}

@RequestMapping("/pol.do")
public String OnApply(HttpServletRequest req) {
	System.out.println("invoked apply");
	
	String msg=req.getParameter("message");
	System.out.println("Message:"+msg);
	
	String email =req.getParameter("email");
	System.out.println("Email:"+email);
	
	String file=req.getParameter("file");
	System.out.println("File Details:"+file);
	
	return "/political.jsp";
}
}
