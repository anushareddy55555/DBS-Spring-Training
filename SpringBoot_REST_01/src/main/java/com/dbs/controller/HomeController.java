package com.dbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping("/hello/{name}/{tech}")
	public String sayHello(@PathVariable String name,@PathVariable String tech) {
	//	System.out.println("Inside of sayHello "+name+", "+tech);
		return "Hello "+name+", hope you are enjoying "+tech;
	}
	@ResponseBody
    @RequestMapping(value="/hello" , method=RequestMethod.POST)
	public String myPost(@RequestParam String name,@RequestParam String tech) {
    	System.out.println("Inside of Post");
	return "Hello "+name+", hope you are enjoying "+tech; 
}
	@ResponseBody
    @RequestMapping(value="/hello" , method=RequestMethod.PUT)
	public String myPut() {
		return "Inside of PUT";
	}
	@ResponseBody
    @RequestMapping(value="/hello" , method=RequestMethod.DELETE)
	public String myDelete() {
		return "Inside of DELETE";
	}
}
