package com.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.didemo.service.GreetingService;

@Controller
public class ConstructorInjectedController {
	private GreetingService greetingService;
	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
		
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
