package com.skillstorm.projects;

import java.util.Random;
import java.util.Scanner;

public class GameScenes{

	private int translator;
	private int sword;
	
	public GameScenes() { }	
	
	public void event1(Player player, Scanner in) {
		
		System.out.println("************************ [ Incoming Transmission ] *************************\n");
		System.out.println("Hey! Did you miss me? Just messing with you. I know you did! Anyway, I found this old"
						 + "\nold ship. I am guessing there was another expedition that, from the looks of it, met"
						 + "\nthe same fate we did... ");
		
		String searchShip;
		do { 
			 System.out.println("\nShould we look inside or just keep going?");
			 System.out.println("\nA. Search The Ship\n"
			 				  + "B. Keep Walking\n");
			 searchShip = in.nextLine();
		} while (!searchShip.equalsIgnoreCase("A") && !searchShip.equalsIgnoreCase("B"));
			
		if (searchShip.equalsIgnoreCase("A")) {
			System.out.println("\nIt gives me the creeps, but your the boss!");
			wreckedShip(player, in);
		} else {
			System.out.println("Well the only other option here is too take a look at the terrain. I mean it's pretty"
							 + "\nbarren... It does get pretty cold at night. I miss the ship already. This is the"
							 + "\nfirst time I have really been out of it. I have used almost all of the resources in"
							 + "\nit so I guess it was good you showed up when you did..."
							 + "\nI guess it's time to move. I will talk to you when I find someone new.");
			System.out.println("\n**************************** [ Daniel is Busy ] ****************************\n");
		}
		
	}
	
	public void event2(Player player, Scanner in) {
		
		System.out.println("************************ [ Incoming Transmission ] *************************\n");
		System.out.println("Being so far from the ship seems almost wrong. I don't know what I am doing out here but it"
						 + "\nis nice to finally have someone to talk to... There seems to be some mounds of structures"
						 + "\nnot to far from where I am standing. I guess it's time to check it out. I've been curious"
						 + "\nfor a while but now I can go without fear! Maybe a little fear... Seems like there are "
						 + "\npeople out there near the hill. Maybe not people exactly... I'll go take a look.\n"
						 + "\nAs expected, they are martians.");
		if (translator >= 1) {		
			System.out.println("\n...That must be what we picked it up for. Let me talk to them."
							 + "\nThey gave me a sword! I explained what happened to me and they unanimously agreed that if I can"
							 + "\ndeal with this big angry guy, I would be accepted into their clan I guess? So I won't be alone! "
							 + "\nDidn't think getting in would be so difficult though... I guess I will do anything I can because"
							 + "\nit doesn't look like I will be able to get off of here any time soon. Let's get out of here!\n");
			player.setStrength(player.getStrength() + 5);
			System.out.println("**************************** [ Daniel is Busy ] ****************************\n");
		} else if (translator <= 0) {
			String villageChoice;
			do {
				System.out.println("\nI don't really know what to do here. I definitely don't speak martian. From the looks of it,"
								 + "\nwe could raid them for supplies or we can try to talk to them anyway. What should we do?");
				System.out.println("\nA. Raid the village"
								 + "\nB. Talk to them.\n");
				
				villageChoice = in.nextLine();
			} while (!villageChoice.equalsIgnoreCase("A") && !villageChoice.equalsIgnoreCase("B"));
		if (villageChoice.equalsIgnoreCase("A")) {
			System.out.println("\nAlright wish me luck! I will try my best *SNEAKYYYY*"
							 + "\nOh god wait a second... I think they saw me... THEY DEFINITELY SAW ME OH GOD"
							 + "\nI barely got out of there... I can't believe you told me to do that! If I wasn't"
							 + "\nso desperate for help, I wouldn't listen to you so easily...");
			player.setMaxHP(player.getMaxHP() - 3);
			player.setDurability(player.getDurability() - 2);
			System.out.println("\nLet's see how we're doing now.\n"
							 + "\nStrength: " + player.getStrength() + "\nDurability: " + player.getDurability() 
							 + "\nHealth: " + player.getMaxHP());
			System.out.println("\nThey definitely did more damage to me than I thought. I can't make such crazy"
							 + "\ndecisions. Can you actually help me next time instead of hurting me.? Let's get "
							 + "\nout of here.\n");
			System.out.println("**************************** [ Daniel is Busy ] ****************************\n");
		} else {
			System.out.println("\nDidn't really even seem to help. They were more curious on proding me or that is"
							 + "\nthe only thing that I can assume by the way they kept approaching me and trying to"
							 + "\ntake my suit off. At least the air here is breathable. That's the only reason we"
							 + "\n(my team) and I were sent out here. You hear it all over the news all the time."
							 + "\nLooking for a new place to inhabit. Guess here is a no go considering we won't be"
							 + "\n coming back. Anyway, I am going to leave before I end up with a probe.");
			System.out.println("**************************** [ Daniel is Busy ] ****************************\n");
			}
		}
	}
		
	public void event3(Player player, Scanner in) {
		
		System.out.println("************************ [ Incoming Transmission ] *************************\n");
		System.out.println("Here we can find more and more dirt and rocks. Walking around so much is work but every now"
						 + "\nevery now and then you can find cool stuff I guess. My ship could use some power and maybe we"
						 + "\ncan make it work again. I could probably make one, but it would take a battery at least. From"
						 + "\nhere I can see... mountain. I can try to find a battery up there. It seems to have some weird"
						 + "\nweird electrical activity. Some dark colored clouds and thunder. I don't know.\n");
		System.out.println("In my eyes, the only thing that makes sense is to go see what is going on. At this point,"
						 + "\nI dont really have anything left to lose.");
		System.out.println("\nAlright I made it to the mountain. There isn't any batteries up here but I found a note. Here"
						 + "\nIs what it says. 'Do not enter. There is danger in the cave but also high rewards. If someone "
						 + "\nreads this, IT ISN'T WORTH IT.'"
						 + "\nWell... That was pretty intense... I neglected to mention there is a cave and this may be what "
						 + "\nthis note is referring to.");
		String caveChoice;
		
		do {
			System.out.println("\nShould we go inside?\n"
							 + "\nA. Go inside the cave."
							 + "\nB. Walking around the cave.\n");
			caveChoice = in.nextLine();
		
		} while (!caveChoice.equalsIgnoreCase("A") && !caveChoice.equalsIgnoreCase("B"));
		
		if (caveChoice.equalsIgnoreCase("A")) {
			System.out.println("\nDo you just like to ignore warnings of certain death?");
			cave(player, in);
		
		} else {
			
			System.out.println("\nOkay well that makes sense... I can't say I am not curious, but this is the safest option."
							 + "\nLooking around, there is a lot of rocks. Who knew? Do you think there is something on this"
							 + "\nplanet that we have to be worried about..? "
							 + "\nThere are rock formations on the back of the mountains that may be climbable."
							 + "\nGod that was a stuggle... But there isn't anything up here. Oh wait... What is THAT?"
							 + "\nSomething just left the cave. Something really big... It looked like a mutated martian but I"
							 + "\ncouldn't be too sure. It was huge. I couldn't face that thing! Leys get out of here. I don't"
							 + "\nwant to fall and hurt myself.");
			System.out.println("\n**************************** [ Daniel is Busy ] ****************************\n");
		}
		
	}
	
	public void event4(Player player, Scanner in) {
		
		System.out.println("************************ [ Incoming Transmission ] *************************\n");
		System.out.println("It just seems like all of this is going to be a lot a walking! Yay... At least my legs are going to"
						 + "\nbe killer if I ever leave this place. The views are amazing. can't lie about Let's see what we got "
						 + "\ngoing on here. I mean there is something shiny. Seems like it is on the move! We should definitely"
						 + "\ngo see what that is.\n"
						 + "\nSeems like we go two options here. We can go over the this big rock in the way, or we can walk around"
						 + "\nand go through the valley.");
		
		String shinyChoice;
		do {
			System.out.println("\nWhat should we do?\n"
							 + "\nA. Over the rock"
							 + "\nB. Go through the Valley\n");
			shinyChoice = in.nextLine();
			
		} while (!shinyChoice.equalsIgnoreCase("A") && !shinyChoice.equalsIgnoreCase("B"));
		
		if (shinyChoice.equalsIgnoreCase("A")) {
			endingRover(player);
		} else {
			System.out.println("\nAlright, sliding down a valley not ganna be too bad right? I guess there is no other way to find out"
							 + "\nAlright here we go! Oh no... OH NO..."
							 + "\nWell... that was a disaster... Got banged up pretty bad... but I am alive that god... Lets just check to"
							 + "\nmake sure...");
			player.setMaxHP(player.getMaxHP() - 1);
			System.out.println("Strength: " + player.getStrength() + "\nDurability: " + player.getDurability() + "\nHealth: " + player.getMaxHP());
			System.out.println("\nI guess that wasn't too bad but man was that a a long way... I am just going to give up on this. I can't take"
							+ "a hit like this.");
			System.out.println("\n**************************** [ Daniel is Busy ] ****************************\n");
		}
	}
	
	
	
	public void finalEvent(Player player, Scanner in, Monster monster) {
		
		System.out.println("************************ [ Incoming Transmission ] *************************\n");
		System.out.println("This is it... I've been scared of this moment happening but here it is and I can't do anything about it. I want"
						 + "\nto go home but here I am and I am about to risk my life... The thing  I saw at the cave is not too far and I"
						 + "\nhave to do something about it if I am going to stay on this big rock planet... Let's get this started...\n");
		System.out.println("My life will be in your hands from now on... I can't talk much obviously..."
						 + "\nGood luck and for the love of God... don't mess it up.");
		actions(player, in, monster);
	}
	
	
	public void wreckedShip(Player player, Scanner in) {
		
		System.out.println("\nThis place is crazy. Definitely not as bad as ours was though. There might be something"
						 + "\nworth salvaging. I keep hearing noises coming from the back of this place though. Guess"
						 + "\nwe may or may not find out what that is.\n"
						 + "\nThe lights are all off in here. Using my headlight but it doesn't have charge to last"
						 + "\nforever. I can't stay in here forever. I can go left, right or straight.");
		
		String navigation;
		do { System.out.println("\nWhere should we go?");
			 System.out.println("\nA. Left"
			 				  + "\nB. Right"
			 				  + "\nC. Straight\n");
			 navigation = in.nextLine();
		} while (!navigation.equalsIgnoreCase("A") && !navigation.equalsIgnoreCase("B") && 
				 !navigation.equalsIgnoreCase("C"));
		
		if (navigation.equalsIgnoreCase("A")) {
			System.out.println("\nAlright. Left it is.\n"
							 + "\n There isn't much going on here. I am just going to leave. I guess there wasn't "
							 + "\nas much here as I thought.Theres just a lot of broken floor boards and cabinets,"
							 + "\n but whatever was in here must have been taken out a long time ago...\n"
							 + "\nLet me get out of here and catch my breath.");
			System.out.println("\n**************************** [ Daniel is Busy ] ****************************\n");
		} else if (navigation.equalsIgnoreCase("B")) {
			endingSpaceShip(player);
		} else {
			System.out.println("\nGoing straight. Ol' reliable!\n"
							 + "\nStrange... The noises seem to be getting louder the deeper I get into this place...\n"
							 + "\nOH GOD WHAT IS THAT!? I AM GETTING OUT OF HERE!\n"
							 + "\nGod... I barely got out of there... I tripped and messed up my leg a little bit. "
							 + "\nIt's not like I can't walk but... Let's just check out the body scanner...\n");
			player.setMaxHP(player.getMaxHP() - 2);
			System.out.println("Strength: " + player.getStrength() + "\nDurability: " + player.getDurability() + "\nHealth: " + player.getMaxHP());
			System.out.println("\nGuess the suit doesn't really take those kind of blows. Maybe for combat?"
							 + "\nLet me catch my breath... That was a lot...");
			System.out.println("\n**************************** [ Daniel is Busy ] ****************************\n");
			
		}
		
	}
	
	public void cave(Player player, Scanner in) {
		
		String searchCave;
		System.out.println("It's wet and dark in here... I should be saving the battery on my headlamp... It sounds like something"
						 + "\nis almost breathing in here. It would have to be big if I can hear it. I am starting to think this"
						 + "\nwasn't such a good idea... I can turn back.");
		do {
			System.out.println("\nNo harm no foul right?\n"
							 + "\nA. Keep Searching"
							 + "\nB. Alright leave\n");
			searchCave = in.nextLine();
		} while (!searchCave.equalsIgnoreCase("A") && !searchCave.equalsIgnoreCase("B"));
		
		if (searchCave.equalsIgnoreCase("A")) {
			System.out.println("...I just keep hearing breathing... Wait... Something's coming. Let me hide."
							 + "\nI wouls scream right noe if I wasn't completely petrified... What is that? It is essentially a"
							 + "\nmutated martian. I am so glad it didn't see me, but I am not in the clear yet. I see something in the"
							 + "\ncorner. Looks like a little device. Maybe stolen. It will be stolen again. By me. Haha."
							 + "\nAlright. I don't think I hear foot steps anymore. I am in the back of the cave so as soon as I grab"
							 + "\nthat thing I am booking it out of here."
							 + "\nIt's a translator! This might come in handy. Alright. Off again to the next!");
			translator = 1;
			System.out.println("\n**************************** [ Daniel is Busy ] ****************************\n");
		} else {
			System.out.println("You're right. I would love to do that thanks."
							 + "\nIs that... Footsteps?"
							 + "\nLETS GO LETS GO LETS GO LETS GO!"
							 + "\nI am pactically hugging the outside of this cave right now. I can't believe what I just saw. Thank god"
							 + "\nit didn't see me. Maybe the note was right and staying in there any longer would be the worst idea possible."
							 + "\nIt's time to go. I am not going to stick around to see anymore of that place.");
			translator = 0;
		}
		
	}

	public void actions(Player player, Scanner in, Monster monster) {
		
		String battleChoice;
		System.out.println("Monster HP: " + monster.getMonsterHP());
		System.out.println("My HP: " + player.getMaxHP());
		
		do {
			System.out.println("\nWhat are we doing..?\n"
							 + "\nA. Attack"
							 + "\nB. Defend\n");
			battleChoice = in.nextLine();
		} while (player.getMaxHP() > 0 && monster.getMonsterHP() > 0 && !battleChoice.equalsIgnoreCase("A") && 
				!battleChoice.equalsIgnoreCase("B"));
		
		
		
		if (battleChoice.equalsIgnoreCase("A")) {
			
			atk(player, in, monster);
			
		} else if (battleChoice.equalsIgnoreCase("B")) {
		
			def(player, in, monster);
		}
		
	}
	public void atk(Player player, Scanner in, Monster monster) {
		Random rand = new Random();
		
		int monsterDamage = rand.nextInt(monster.getMonsterAtk());
		
		int playerDamage = rand.nextInt(player.getStrength());
	
		player.setMaxHP(player.getMaxHP() - monsterDamage);
		monster.setMonsterHP(monster.getMonsterHP() - playerDamage);
		
		if (player.getMaxHP() > 0 && monster.getMonsterHP() > 0) {
			actions(player, in, monster);
		} else if (player.getMaxHP() >= 0 && monster.getMonsterHP() <= 0) {
			endingGood(player);
		} else if (player.getMaxHP() <= 0 && monster.getMonsterHP() >= 0) {
			endingBad(player);
		}
		
	}
	
	public void def(Player player, Scanner in, Monster monster) {
		Random rand = new Random();
		int monsterDamage = rand.nextInt(monster.getMonsterAtk());
		
		int playerDamage = rand.nextInt(player.getStrength());
		player.setMaxHP(player.getMaxHP() - monsterDamage + 3);
		monster.setMonsterHP(monster.getMonsterHP() - playerDamage);
		System.out.println("Monster HP: " + monster.getMonsterHP());
		System.out.println("My HP: " + player.getMaxHP());
		
		if (player.getMaxHP() > 0 && monster.getMonsterHP() > 0) {
			actions(player, in, monster);
		} else if (player.getMaxHP() > 0 && monster.getMonsterHP() <= 0) {
			endingGood(player);
		} else if (player.getMaxHP() <= 0 && monster.getMonsterHP() > 0) {
			endingBad(player);
		}
	
	}
	
	public void endingSpaceShip(Player player) {
		System.out.println("\nRight must be the RIGHT way to go! Get it?\n"
				 + "\nNevermind let's see what's going on in here!\n"
				 + "\nYOU'LL NEVER BELIEVE WHAT I FOUND! AN ESCAPE POD! I CAN LEAVE AND GO HOME!"
				 + "\nIt's fully operational from what I can tell. So I guess that means this is it huh?"
				 + "\n" + player.getName() + ", you have helped me more than enough. Guess I would don't even really be" 
				 + "\nhere or have found this without you right? Well thank you for all your help. Let's "
				 + "\ngrab a bite when I get back yeah? Haha!\n");
		System.out.println("************************ [ Transmission Terminated ] *************************");
		System.exit(0);
	}
	
	public void endingRover(Player player) {
		System.out.println("\nWhat about astronaut suit says 'oh yeah climbing will be a breeze'? I guess it is up to you though"
				 + "\nisn't it? Aright let's see what is goin on past this rock. I think this could be a sign..."
				 + "\nIt... It looks like a rover...? Maybe something like the Mars rover. Maybe I could send a them a"
				 + "\nmessage to them. I am ready to head out of here. If this thing is still working I will send a"
				 + "\ndistress signal... It does!");
		System.out.println("***************************** * A FEW DAYS LATER * **************************\n"
				 + "\nThe ship is here so I guess this is it. I am going back going back home. I can't tell you how much"
				 + "\nhelp it's been to have you been " + player.getName() + ". I have to leave now but maybe when I get home"
				 + "\nwe could get a drink?");
		System.out.println("************************ [ Transmission Terminated ] *************************");
		System.exit(0);
	}
	
	public void endingGood(Player player) {
		System.out.println("\nI DID IT! I actually did it... I survived that thing and now... it looks like the martians have"
						 + "\nbeen watching me this whole time... I can't believe it. I need to breathe right now. That was crazy"
						 + "\nand I can't believe I am alive. I really have to thank you " + player.getName() + ". I couldn't have done it"
						 + "\nwithout you... I guess I am one of them now. Thank god honestly I wouldn't make it out here all on my own."
						 + "\nSo I guess this is goodbye for now... I don't need you anymore... Well all I can say now is keep an eye on"
						 + "\nyour command line... You never know when I may pop up again. See ya!");
		System.out.println("\n************************ [ Transmission Terminated ] *************************");
		System.exit(0);
	}
	
	public void endingBad(Player player) {
		System.out.println("Oh god... There's a lot of blood... I don't think I can take much more of this... I --\n");
		System.out.println("\n************************ [ Transmission Terminated ] *************************");
		System.exit(0);
	}
	
	public int getTranslator() {
		return translator;
	}
	public void setTranslator(int translator) {
		this.translator = translator;
	}
	public int getSword() {
		return sword;
	}
	public void setSword(int sword) {
		this.sword = sword;
	}
	
}
