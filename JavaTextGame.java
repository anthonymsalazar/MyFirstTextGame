package com.skillstorm.projects;

import java.util.Scanner;

public class JavaTextGame {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Player player = new Player();
		Monster monster = new Monster(30, 5);
		
		player.playerSelection();
		player.playerStats();
		
		GameScenes scene = new GameScenes();
		scene.event1(player, in);
		scene.event3(player, in);
		scene.event2(player, in);
		scene.event4(player, in);
		scene.finalEvent(player, in, monster);
		
	}
}