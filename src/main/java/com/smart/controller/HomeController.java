package com.smart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	//Home handler
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("title","Home-Smart contact manager");
		return "home";
	}
	
	//About handler
	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title","About-Smart contact manager");
		return "about";
	}
	
	//Singup handler
	@RequestMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("title","Register-Smart contact manager");
		return "signup";
	}
	
	//Signin handler
	@RequestMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("title","Login-Smart contact manager");
		return "login";
	}

}
