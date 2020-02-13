package com.xworkz.hema;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Component
@RequestMapping("/")
public class Country {
	
	public Country() {
		System.out.println("created \t" +this.getClass().getSimpleName());
	}
	
	
	@RequestMapping("/country.do")
	public String facility(HttpServletRequest req) {
		System.out.println("inviked facility");
		
		String CName=req.getParameter("countryName");
		System.out.println("CountryName"+CName);
		

		String CSatates=req.getParameter("noOfStates");
		System.out.println("NoOfStates"+CSatates);
		

		String CPopulation=req.getParameter("noOfPopulation");
		System.out.println("NoOfPopulation"+CPopulation);
		

		String Creligions=req.getParameter("religions");
		System.out.println("Religions"+Creligions);
		
		
		return "/com.jsp";
	}

}
