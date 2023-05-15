package com.skillstorm.projects;

import java.util.Scanner;

public class Player {
	
	private  String name;
	private int maxHP;
	private int strength;
	private int durability;
	
	public Player(String name, int maxHP, int strength, int durability, int potion, int antivenom) {
		this.name = name;
		this.maxHP = maxHP;
		this.strength = strength;
		this.durability = durability;
	}
	
	public Player() {}

	public void playerSelection() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("************************ [ Incoming Transmission ] *************************\n");
		System.out.println("Hello??? Is Anyone there? Seems like this transmission finally got a hold "
						 + "of someone!\n");

		do {
			System.out.println("What can I call you?\n");
			name = in.nextLine();
		} while (name.trim().equalsIgnoreCase(""));
		
		System.out.println("\nThank God! It's nice to meet you " + name + "! I havent talked to anyone in so long!"
						 + "\nMy spaceship crashed... "
						 + "\nI am the only survivor... BUT let's not dwell on that... My name is Daniel."
						 + "\nJust like you, I am from Earth! The Government didn't want you to know about"
						 + "\nthese space expeditions, but I guess it doesn't really matter now that"
						 + "\nI'm the only one left. Anyway, I need your help. I am probably the least qualified"
						 + "\nof our crew so at this point, I am willing to take any help I can get."
						 + "\nGive me a second to look over everything... I will be right back.");
		System.out.println("\n**************************** [ Daniel is Busy ] ****************************\n");
		
	}
	
	public void playerStats() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("************************ [ Incoming Transmission ] *************************\n");
		
		System.out.println("I know I know. 'You should have looked before. Haven't you been alone for a while?'"
						 + "\nYes I have but it is not my fault. What would you do stranded in some random planet?"
						 + "\nThat's besides the point. I did find something pretty interesting on my suit but I"
						 + "\ndidn't want to mess with it 'til I got some help and here you are. It's a body scanner."
						 + "\nI have the option to set this suit to the default settings or I can have the chance to"
						 + "\nmake it better! Of course... that means I could also make it worse... What should I do?");
		
		String statChoice;
		do { 
			 System.out.println("\nShould I take my chances or play it safe and do default?\n");
			 System.out.println("A. Take your chances\n"
					 		  + "B. Keep it safe\n");
			 statChoice = in.nextLine();
		} while (!statChoice.equalsIgnoreCase("A") && !statChoice.equalsIgnoreCase("B"));
		
		if (statChoice.equalsIgnoreCase("A")) {
			System.out.println("\nAlright! Lets see how our luck turns out!\n");
			
			maxHP = 10;
			strength = (int)(Math.random() * (15 - 5) + 5);
			durability = (int)(Math.random() * (15 - 5) + 5);
			
			System.out.println("Strength: " + strength + "\nDurability: " + durability + "\nEven my Health: " + maxHP);
		} else {
			System.out.println("\nYou're probably right. Better safe that sorry they always say.\n"
							 + "\nHere is what is says for default.");
			maxHP = 10;
			strength = 8;
			durability = 5;
			
			System.out.println("Strength: " + strength + "\nDurability: " + durability + "\nEven my Health: " + maxHP);
		}
		System.out.println("Alright I think that's everything. Let's get out of here!");
		System.out.println("\n**************************** [ Daniel is Busy ] ****************************\n");
	}
	
	public String getName() {
		return name;
	}
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDurability() {
		return durability;
	}
	public void setDurability(int durability) {
		this.durability = durability;
	}
}