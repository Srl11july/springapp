package org.myonlineapp.controller;

import org.myonlineapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserService userService;
	ModelAndView mv;
	
	@RequestMapping("/get/{userid}")
	@Transactional
	public ModelAndView getUserDetails(){
		mv = new ModelAndView("userdetail");
		mv.addObject("user", userService.getUserById(100L));
		return mv;
	}
}
