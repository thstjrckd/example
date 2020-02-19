package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path= {"/board"})
public class BoardController {

	@GetMapping(path= {"/flist"})
	public String flist() {
		
		return "fboard/list";
	}
	
	@GetMapping(path= {"/fwrite"})
	public String showList() {
		
		return "fboard/write";
	}
	
	//============================================
	
	@GetMapping(path= {"/send"})
	public String send() {
		
		return "/home";
	}
	@GetMapping(path= {"/rlist"})
	public String rlist() {
		
		return "/home";
	}
	@GetMapping(path= {"/member-list"})
	public String memberList() {
		
		return "/home";
	}
	
}
