package com.dbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dbs.beans.Person;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
 @RequestMapping("/hello/{name}/{tech}")
 public ModelAndView hello(@PathVariable("name") String name,@PathVariable("tech") String tech) {
	// System.out.println("Hello "+name+", glad to work in "+tech);
	 String model="Hello "+name+", glad to work in "+tech;
	 ModelAndView modelAndView=new ModelAndView("hello");
	 modelAndView.addObject("aaa",model);
	 return modelAndView;           
 }
 
 @RequestMapping("/register")
 public ModelAndView registration(@RequestParam("un") String username,@RequestParam("em") String email,@RequestParam("mo") String mobile) {
	// System.out.println("User name: "+username);
	// System.out.println("Email: "+email);
	 //System.out.println("Mobile: "+mobile);
	 Person person=new Person(username,email,mobile);
	 ModelAndView modelAndView=new ModelAndView("regsuccess");
	 modelAndView.addObject("person",person);
	 return modelAndView;
 }
}
