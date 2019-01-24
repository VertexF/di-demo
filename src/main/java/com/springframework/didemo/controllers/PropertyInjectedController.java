package com.springframework.didemo.controllers;

import com.springframework.didemo.service.GreetingServiceImpl;

public class PropertyInjectedController {
	public GreetingServiceImpl greetingServiceImpl;
	
	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
	
}
