package com.dbs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hai")
public class HiController {
	
	@GetMapping("/")
	public String sayHaiNoArg() {
		return "Hai World!!!!";
	}
	
	@GetMapping("/{name}")
public String sayHaiWithArg(@PathVariable String name) {
	return "Hai "+name+"!!!!!";
}
}
