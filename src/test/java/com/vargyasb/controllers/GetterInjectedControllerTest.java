package com.vargyasb.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vargyasb.services.GreetingServiceImpl;

class GetterInjectedControllerTest {

	private GetterInjectedController getterInjectedController;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.getterInjectedController = new GetterInjectedController();
		this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() throws Exception {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
	}
}
