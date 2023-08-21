package com.boot.thymeleaf.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/about")
	public String method(Model model) {
		model.addAttribute("name", "Rajat Gupta");
		model.addAttribute("currentDate", new Date().toLocaleString());
		System.out.println("Inside method");
		return "about";
	}
	
	@RequestMapping("iterate")
	public String method2(Model model) {
		List<String> list =  new ArrayList<>();
		list.add("Rajat");
		list.add("Gaurav");
		list.add("Piyush");
		list.add("Paras");
		list.add("Manocha");
		model.addAttribute("names", list);
		model.addAttribute("gender", "F");
		return "iterate";
	}
	
	@GetMapping("about-new")
	public String about() {
		return "aboutnew";
	}
	
}
