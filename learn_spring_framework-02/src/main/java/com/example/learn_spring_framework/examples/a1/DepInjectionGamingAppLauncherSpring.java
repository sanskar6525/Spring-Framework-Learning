package com.example.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
	/*
	 * Depenedency1 dependency1; Depenedency2 dependency2;
	 * 
	 * public String toString() { return "Using "+dependency1+" and "+dependency2; }
	 * }
	 */

@Component
class Depenedency1{
	
	
}

@Component
class Depenedency2{
	
}








@Configuration
@ComponentScan
public class DepInjectionGamingAppLauncherSpring 
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
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DepInjectionGamingAppLauncherSpring.class);
		
		//context.getBean(GamingConsole.class).up();
		Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
		
	}
}
