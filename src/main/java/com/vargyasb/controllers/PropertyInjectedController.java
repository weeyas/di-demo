package com.vargyasb.controllers;

import com.vargyasb.services.GreetingServiceImpl;

public class PropertyInjectedController {
/*
 * HOW NOT TO DO IT
 * (1) public property
 * (2) property type egy concrete class, nem IF
 */
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
