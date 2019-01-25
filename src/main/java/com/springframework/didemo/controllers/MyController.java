package com.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

import com.springframework.didemo.service.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() 
	{
		System.out.println("Hello World");
		return greetingService.sayGreeting();
	}
}
