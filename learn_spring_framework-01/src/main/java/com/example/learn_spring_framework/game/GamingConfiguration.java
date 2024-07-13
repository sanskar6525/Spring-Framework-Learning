package com.example.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game()
	{
		PacmanGame game=new PacmanGame();
		return game;
	}
	
	
	@Bean
	public GameRunner gameRunner()
	{
		GameRunner gameRunner=new GameRunner(game());
		return gameRunner;
	}
	

}
