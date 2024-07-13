package com.example.learn_spring_framework.hellospring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.ProjectIgi;
  
public class App02HelloSpring {

	public static void main(String[] args)  {
		
		//1. Launch a spring context
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);
		
		
		 System.out.println(context.getBean("name"));
		 
		 System.out.println(context.getBean("age"));
		 
		 System.out.println(context.getBean("person"));
		 
		 System.out.println("\nPerson2 Method Call: ");
		 System.out.println(context.getBean("person2MethodCall"));
		 
		 System.out.println("\nPerson3 Parameters: ");
		 System.out.println(context.getBean("person3Parameters"));
		 
		 System.out.println("\nPerson4 Parameters: ");
		 System.out.println(context.getBean("person4Parameters"));
		 
		 System.out.println("\nPerson4 Parameters using Primary annotation: ");
		 System.out.println(context.getBean(Person.class));
	
		/*
		 * System.out.println("\nBean Definitions: ");
		 * Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		 */
		 
		 System.out.println("\n");
		 System.out.println(context.getBean("address2"));
		 
		 
		 
		 System.out.println("\n");
		 System.out.println(context.getBean(Address.class));
			/*
			 * for(String s:context.getBeanDefinitionNames()) System.out.println(s);
			 */
			
	}

}
