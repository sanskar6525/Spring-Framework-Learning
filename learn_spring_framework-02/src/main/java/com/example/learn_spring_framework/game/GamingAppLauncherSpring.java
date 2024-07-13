package com.example.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingAppLauncherSpring 
{
	/*
	 * @Bean public GamingConsole game() { PacmanGame game=new PacmanGame(); return
	 * game; }
	 */
	
	
	/*
	 * @Bean public GameRunner gameRunner(GamingConsole game) {
	 * //System.out.println("Parameter: "+game); GameRunner gameRunner=new
	 * GameRunner(game); return gameRunner; }
	 */
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(GamingAppLauncherSpring.class);
		
		//context.getBean(GamingConsole.class).up();
		
		context.getBean(GameRunner.class).run();
	}
}
