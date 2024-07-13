package com.example.learn_spring_framework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleContextLauncherGamingAppLauncher 
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
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SimpleContextLauncherGamingAppLauncher.class);
		
		//context.getBean(GamingConsole.class).up();
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
		
	}
}
