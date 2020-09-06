package com.example.helloworld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
	
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name")String name, @RequestParam(value="location")String location) {
		return "welcome to the " + location + " " + name + "!";
	}
	
}
