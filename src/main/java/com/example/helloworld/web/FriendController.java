package com.example.helloworld.web;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.helloworld.domain.Friend;



@Controller
public class FriendController {
	List<Friend> friends = new ArrayList<Friend>();
	
	@RequestMapping(value="/friend", method=RequestMethod.GET)
	public String friendList(Model model) {
		model.addAttribute("friends", friends);
		return "friend";
		
		
	}
	@RequestMapping(value="/friend", method=RequestMethod.POST)
	public String friendlistSubmit(@ModelAttribute Friend friend) {
		friends.add(friend);
		return "redirect:/friend";
	}
	}
	
	

