package com.example.learn_spring_framework.hellospring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age, Address address) {};
record Address(String street,int pin) {};

//This is the configuration class

/*2. Configure the things that we want spring to manage. 
	The annotation helps Spring that using this file we have to configure the beans*/
@Configuration
public class HelloSpringConfiguration {
	
	@Bean
	public String name()
	{
		return "SAMPLE_101";
	}
	

	@Bean
	public int age()
	{
		return 23; 
	}
	
	@Bean
	public Person person()
	{
		return  new Person("Ravi",20,new Address("Shibpur",892));
		
	}
	
	@Bean
	public Person person2MethodCall()
	{
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person person3Parameters(String name,int age,Address address3)
	{
		return new Person(name,age,address3);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name,int age,@Qualifier("addressQualifier")Address address)
	{
		return new Person(name,age,address);
	}
	
	@Bean
	public Person person2()
	{
		return new Person("Ravi",20,address());
	}
	
	
	@Bean(name="address2")
	@Primary
	public Address address()
	{
		return new Address("Newtown",890);  
	}
	
	@Bean(name="address3")
	@Qualifier("addressQualifier")
	public Address address3()
	{
		return new Address("Salt Lake",899);  
	}
}
 