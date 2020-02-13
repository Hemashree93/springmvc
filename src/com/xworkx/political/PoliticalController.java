package com.xworkx.political;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class PoliticalController {
	public PoliticalController() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/app.do")
	public String onApply(HttpServletRequest req) {
		
	System.out.println("invoked onApply");
	
	String partyName=req.getParameter("PartyName");
	System.out.println("PartyName"+partyName);
	
	
	String noOfmembers=req.getParameter("noOfmembers");
	System.out.println("noOfmembers"+noOfmembers);
	
	String partyLogo=req.getParameter("PartyLogo");
	System.out.println("PartyLogo"+partyLogo);
	
	
	return "/Success.jsp";
		
	}
}
