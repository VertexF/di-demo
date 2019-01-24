package com.springframework.didemo.controllers;

import com.springframework.didemo.service.GreetingServiceImpl;

	public class ConstructorInjectedController {
		private GreetingServiceImpl greetingService;
		
		public ConstructorInjectedController(GreetingServiceImpl greetingServiceImpl) {
			super();
			this.greetingService = greetingServiceImpl;
		}
		
		public String sayHello() {
			return greetingService.sayGreeting();
		}

}
