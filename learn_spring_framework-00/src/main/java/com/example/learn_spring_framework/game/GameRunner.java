package com.example.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}
	
	/*
	 * ProjectIgi game; public GameRunner(ProjectIgi game) { this.game=game;
	 */
	
	public void run()
	{
		System.out.println("Running game: "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
