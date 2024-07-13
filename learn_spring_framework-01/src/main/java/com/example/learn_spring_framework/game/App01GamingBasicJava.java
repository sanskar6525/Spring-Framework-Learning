package com.example.learn_spring_framework.game;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		 
		//var Game=new ProjectIgi();
		//var Game=new MarioGame();
		var Game=new PacmanGame(); //Object Creation
		
		var gameRunner= new GameRunner(Game); //This is injecting or wiring of the dependency into the GameRunner class
		gameRunner.run();
	}
}
 