package com.myrest.springapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("rest")
public class MainController {
	ModelAndView mv;
	
	@RequestMapping("/hello")
	public ModelAndView helloText(){
		mv = new ModelAndView("hello");
		mv.addObject("htxt", "SpringApp Welcomes You!!");
		return mv;
	}
	@RequestMapping("/job/get/{id}")
	public ModelAndView getJobDetails(){
		mv = new ModelAndView("hello");
		mv.addObject("job", "Pass the Job Object here.");
		
		return mv; 
	}
}
