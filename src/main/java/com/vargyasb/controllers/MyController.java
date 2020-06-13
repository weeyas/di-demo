package com.vargyasb.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	/*
	 * Ha @Controller-el annotalom akkor egy Spring componens (bean) lesz a osztalyombol
	 */
	
	public String hello() {
		System.out.println("Hello!!! ");
		
		return "foo";
	}
}
