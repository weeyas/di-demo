package com.vargyasb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vargyasb.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		// run method egy Application Context-et ad vissza
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		// elkérjük az application context-bol a bean-t
		// castolni kell, mert Spring Bean-t ad vissza a method
		// mivel letrejott spring contextbe a myController bean, ezert el kell kerni
		// a getBean methoddal, de az osztalyokbol a Spring kisbetuvel kezdodo bean-eket
		// hoz letre, tehat a MyController osztalybol lesz myController bean pl.
		MyController controller = (MyController) ctx.getBean("myController");
		
		controller.hello();
		
	}

}
