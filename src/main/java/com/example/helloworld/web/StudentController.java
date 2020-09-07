package com.example.helloworld.web;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.helloworld.domain.Friend;



@Controller
public class StudentController {
	@RequestMapping("/hello")
	public String handlingList(@RequestParam(value="firstName")String firstName, @RequestParam(value="lastName")String lastName, Model model) {
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
	 return "friendList";
		}
	
	@RequestMapping("/friend")
	public String friendList(Model model) {
		List<Friend> friends = new ArrayList<Friend>();
		Friend friend1 = new Friend("Eetu", "Hämärä");
		Friend friend2 = new Friend("Sami", "Kalpea");
		friends.add(friend1);
		friends.add(friend2);
		model.addAttribute("friends", friends);
		return "friendList";
		
	}}
	
	

