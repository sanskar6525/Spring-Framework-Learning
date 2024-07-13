 package com.example.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.learn_spring_framework.game")
public class App03GamingSpringBeans {
	
	
	/*
	 * @Bean public GameRunner gameRunner(GamingConsole game) {
	 * System.out.println("Parameter: "+game); GameRunner gameRunner=new
	 * GameRunner(game); return gameRunner; }
	 */
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(App03GamingSpringBeans.class);
		
		context.getBean(GamingConsole.class).up();
		
		//context.getBean(GameRunner.class).run();
	}
}
