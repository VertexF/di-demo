package com.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframework.didemo.service.GreetingServiceImpl;

@Controller
public class ConstructorInjectedController {
	private GreetingServiceImpl greetingService;
	
	@Autowired
	public ConstructorInjectedController(GreetingServiceImpl greetingServiceImpl) {
		super();
		this.greetingService = greetingServiceImpl;
	}
		
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
