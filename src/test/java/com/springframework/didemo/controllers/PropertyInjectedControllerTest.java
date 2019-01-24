package com.springframework.didemo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.springframework.didemo.service.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() throws Exception{
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
	}
}
