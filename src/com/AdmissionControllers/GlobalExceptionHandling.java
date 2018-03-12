package com.AdmissionControllers;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandling 
{
	@ExceptionHandler(value=NullPointerException.class)
	public ModelAndView nullHandler(NullPointerException e)
	{
		System.out.println("exception occurs"+e);
		ModelAndView mv=new ModelAndView("nullPointerException");
		mv.addObject("e",e);
		return mv;
	}
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=IOException.class)
	public ModelAndView ioHandler(IOException e)
	{
		System.out.println("exception occurs"+e);
		ModelAndView mv=new ModelAndView("ioException");
		mv.addObject("e",e);
		return mv;
	}
	@ExceptionHandler(value=Exception.class)
	public ModelAndView Handler(Exception e)
	{
		System.out.println("exception occurs"+e);
		ModelAndView mv=new ModelAndView("ioException");
		mv.addObject("e",e);
		return mv;
	}

}
