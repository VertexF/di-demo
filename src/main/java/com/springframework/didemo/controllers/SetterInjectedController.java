package com.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.didemo.service.GreetingService;

@Controller
public class SetterInjectedController {
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

	@Autowired
	@Qualifier("setterGreetingService")
	public void setGreetingService(GreetingService greetingServiceImpl) {
		this.greetingService = greetingServiceImpl;
	}
}
