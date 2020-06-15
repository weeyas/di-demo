package com.vargyasb.services;

import org.springframework.stereotype.Service;

/*
 * @Service annotacio, megmondja a Spring Frameworknek, hogy ez egy komponenes es kezelje
 * Spring Bean-kent.
 */
@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static final String HELLO_GURUS = "Hello Gurus!!!!";

	@Override
	public String sayGreeting() {
		return HELLO_GURUS;
	}
	
	
}
