package com.vargyasb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vargyasb.services.GreetingService;

/*
 * @Controller annotacio, ami megmondja a Spring Frameworknek hogy ez egy Spring component
 * es kezelje Spring Bean-ként 
 */

@Controller
public class GetterInjectedController {
	
	private GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	/*
	 * @Autowired annotacio, megmondja a Frameworknek, hogy injectelje be a GreetingService
	 * dependency-t, ha ez nincs meg akkor a sayHello() methodban NPE-t kapunk mert nem lesz
	 * ott az object amire hivatkozunk 
	 * -- figyelni, hogy itt a setterre rakja ra az annotaciot
	*/
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
