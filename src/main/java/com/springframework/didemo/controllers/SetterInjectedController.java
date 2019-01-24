package com.springframework.didemo.controllers;

import com.springframework.didemo.service.GreetingServiceImpl;

public class SetterInjectedController {
	private GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingServiceImpl greetingServiceImpl) {
		this.greetingService = greetingServiceImpl;
	}
}
