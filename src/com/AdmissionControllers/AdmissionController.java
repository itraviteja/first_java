package com.AdmissionControllers;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdmissionController 
{
	@RequestMapping(value="/Admission.html",method=RequestMethod.GET)
	public ModelAndView admission()
	{
		
	ModelAndView mv=new ModelAndView("AdmissioForm");
	return mv;
	
		
		
		
	}
	
	
	@RequestMapping(value="/Admin.html",method=RequestMethod.POST)
	public  ModelAndView raj(@ModelAttribute ("st")Student s)
	{
		ModelAndView mv=new ModelAndView("submit");
		return mv;
		
	}
	
	@ResponseBody
	@RequestMapping(value="/students" ,method=RequestMethod.GET)
	public ArrayList<Student> getStudents()
	{
		Student s1=new Student();
		s1.setName("Sachin Tendulkar");
		s1.setAge(40);
		Student s2=new Student();
		s2.setName("Mahendrasingh Dhoni");
		s2.setAge(35);
		Student s3=new Student();
		s3.setName("Virat Kohli");
		s3.setAge(29);
		
		
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		return studentList;
		
	}
	
	
	
	@ModelAttribute
	public void  addingmodel(Model m)
	{
		m.addAttribute("head","this is my admission site");
	}
}
