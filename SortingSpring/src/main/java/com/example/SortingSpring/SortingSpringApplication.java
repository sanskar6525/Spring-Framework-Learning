package com.example.SortingSpring;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.sort.SortTemplate;
import com.example.sort.SortingLaunch;



@Configuration
@ComponentScan("com.example.sort")
public class SortingSpringApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SortingLaunch.class);
		
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		
		//context.getBean(SortTemplate.class).run(arr);
		context.getBean(SortingLaunch.class).run(arr);
		
		System.out.println();
		Arrays.stream(context.getBeanDefinitionNames())
		.forEach(System.out::println);

		
		//SpringApplication.run(SortingSpringApplication.class, args);
	}

}
