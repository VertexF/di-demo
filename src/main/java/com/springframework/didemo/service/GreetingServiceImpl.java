package com.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
	
	public static final String HELLO = "Hello, to you world!";

	@Override
	public String sayGreeting() {
		return HELLO;
	}
	
}
