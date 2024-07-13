package com.example.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(GamingConfiguration.class);
		
		context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
	}
}
