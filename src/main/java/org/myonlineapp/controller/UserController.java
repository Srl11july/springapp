package org.myonlineapp.controller;

import org.myonlineapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	ModelAndView mv;
	
	@RequestMapping("/get/{userid}")
	public ModelAndView helloText(){
		mv = new ModelAndView("userdetail");
		mv.addObject("user", userService.getUserById("100"));
		return mv;
	}
}