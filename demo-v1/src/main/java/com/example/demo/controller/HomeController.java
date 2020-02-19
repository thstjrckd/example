package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(path = { "/", "/home" })
	public String Home() {
		
		return "home";
	}
	
	@GetMapping(path = { "/account/login"})
	public String login() {
		
		return "/account/login";
	}
	
	
	@GetMapping(path = { "/account/register"})
	public String regform() {
		
		return "/account/register";
	}
	
	@PostMapping(path = { "register"})
	public String register() {
		
		return "redirect:/account/login";
	}
	
	
	
}
