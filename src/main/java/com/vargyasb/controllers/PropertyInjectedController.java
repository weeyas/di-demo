package com.vargyasb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vargyasb.services.GreetingServiceImpl;

/*
 * @Controller annotacio, ami megmondja a Spring Frameworknek hogy ez egy Spring component
 * es kezelje Spring Bean-ként 
 */

@Controller
public class PropertyInjectedController {
	
	/*
	 * @Autowired annotacio, megmondja a Frameworknek, hogy injectelje be a GreetingServiceImpl
	 * dependency-t, ha ez nincs meg akkor a sayHello() methodban NPE-t kapunk mert nem lesz
	 * ott az object amire hivatkozunk
	 * -- Meg mindig nem jo, hogy a GreetingServiceImpl van deklaralva, es nem az IF
	 * -- Meg mindig public a property, az is egy no-no
	 */
	@Autowired
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
