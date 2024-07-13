package com.example.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ProjectIgiQualifier")
public class ProjectIgi implements GamingConsole{
	public void up()
	{
		System.out.println("Move forward");
	}
	
	public void down()
	{
		System.out.println("Move Back");
	}
	
	public void left()
	{
		System.out.println("Turn Left");
	}
	
	public void right()
	{
		System.out.println("Turn Right");
	}

}
