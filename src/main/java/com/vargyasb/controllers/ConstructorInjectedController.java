package com.vargyasb.controllers;

import com.vargyasb.services.GreetingService;


public class ConstructorInjectedController {

	private GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	String sayHello() {
		return greetingService.sayGreeting();
	}
}
