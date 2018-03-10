package com.AdmissionControllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdmissionController 
{
	@RequestMapping(value="/Admission.html",method=RequestMethod.GET)
	public ModelAndView admission()
	{
		ModelAndView mv=new ModelAndView("AdmissionForm");
		System.out.println("from git hub");
		System.out.println("ravi");
		System.out.println("hai gitty");
		
		return mv;
	}
	@ExceptionHandler(value=Exception.class)
	public String exp()
	{
		System.out.println("exception occurs");
		return "Exception";
	}
	
	@RequestMapping(value="/Admin.html",method=RequestMethod.POST)
	public  ModelAndView raj(@ModelAttribute ("st")Student s)
	{
		ModelAndView mv=new ModelAndView("submit");
		return mv;
		
	}
	
	@ModelAttribute
	public void  addingmodel(Model m)
	{
		m.addAttribute("head","this is my admission site");
	}
}
