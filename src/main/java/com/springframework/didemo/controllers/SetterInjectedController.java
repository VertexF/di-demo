package com.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springframework.didemo.service.GreetingServiceImpl;

@Controller
public class SetterInjectedController {
	private GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	public void setGreetingService(GreetingServiceImpl greetingServiceImpl) {
		this.greetingService = greetingServiceImpl;
	}
}
