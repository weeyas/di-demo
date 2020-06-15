package com.vargyasb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vargyasb.services.GreetingService;

/*
 * @Controller annotacio, ami megmondja a Spring Frameworknek hogy ez egy Spring component
 * es kezelje Spring Bean-ként
 */
@Controller
public class ConstructorInjectedController {

	private GreetingService greetingService;
	/*
	 * -- itt elhagyhato az @Autowire, mert Spring 4.2-tol enabled az automatikus wiring a
	 * 		constructor based komponenseknel
	 * -- de az atlathatosag erdekeben oda szoktak irni, hogy tudjuk, hogy ott en egy injectre varok
	*/ 
	@Autowired
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
