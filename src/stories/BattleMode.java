package stories;

import character.GameCharacter;
import character.Party;
import character.Stats;
import dialogue.Typewriter;

import java.util.ArrayList;
import java.util.Scanner;

public class BattleMode {
	private static int health1 = 115, health2 = 80, health3 = 80;
	private static int attack1 = 15, attack2 = 10, attack3 = 10;

	
	public static void StartBattle(Party party, String enemy1, String enemy2, String enemy3)
	{
		
		ArrayList<GameCharacter> characters = getCharacters(party);
		System.out.println("Battle has started");

		
		outerLoop:
			while(true)	{
		      for(GameCharacter character : characters) {
		  		//System.out.println(character.getGameClass());
		    	  

		    	  if(party.isAlive() && health1 <= 0 && health2 <= 0 && health3 <= 0) {
		    		  Typewriter.type(party.getName() + " have won!");
		    		  Typewriter.type("Congrats you have taken over Mars!");
		    		  break outerLoop;
		    	  }
		    	  else if(!party.isAlive()) {
		    		  Typewriter.type(party.getName() + "have been defeated!");
		    		  Typewriter.type("The aliens get to keep their planet!");
		    		  break outerLoop;
		    	  }
		    	  if(!character.isAlive()) {
		    		  continue;
		    	  }
		    	  
		    	  Typewriter.type("It is currently " + character.getName()+ "'s turn. ");
		    	  
		    	  getAttack(character, enemy1, enemy2, enemy3);
		    	  

            
        }
	}
}
	private static void getAttack(GameCharacter character, String enemy1, String enemy2, String enemy3)
	{
			Stats currentStats = character.getGameClass().getStats(); //Gets the current player's stats
			float attack = 0;
			
			Scanner input = new Scanner(System.in);
			String target = " ";
		if(BattleMode.health1 > 0 && BattleMode.health2 > 0 && BattleMode.health3 > 0) {
			Typewriter.type("Who would you like to attack? Currently alive enemies are:");
			Typewriter.type(enemy1 + ", " + enemy2 + ", " + enemy3 );
			Typewriter.type("Chose one: ENEMY1, ENEMY2, ENEMY3");
			target = input.nextLine().trim().toUpperCase();
		}
		else if(BattleMode.health1 <= 0 && BattleMode.health2 > 0 && BattleMode.health3 > 0) {
			Typewriter.type("Who would you like to attack? Currently alive enemies are:");
			Typewriter.type( enemy2 + ", " + enemy3 );
			Typewriter.type("Chose one: ENEMY2, ENEMY3");
			target = input.nextLine().trim().toUpperCase();
		}
		else if(BattleMode.health1 > 0 && BattleMode.health2 <= 0 && BattleMode.health3 > 0) {
			Typewriter.type("Who would you like to attack? Currently alive enemies are:");
			Typewriter.type( enemy1 + ", " + enemy3 );
			Typewriter.type("Chose one: ENEMY1, ENEMY3");
			target = input.nextLine().trim().toUpperCase();
		}
		else if(BattleMode.health1 > 0 && BattleMode.health2 > 0 && BattleMode.health3 <= 0) {
			Typewriter.type("Who would you like to attack? Currently alive enemies are:");
			Typewriter.type( enemy1 + ", " + enemy2 );
			Typewriter.type("Chose one: ENEMY1, ENEMY2");
			target = input.nextLine().trim().toUpperCase();
		}
		else if(BattleMode.health1 <= 0 && BattleMode.health2 <= 0 && BattleMode.health3 > 0) {
			Typewriter.type("Who would you like to attack? Currently alive enemies are:");
			Typewriter.type( enemy3 );
			Typewriter.type("Chose one: ENEMY3");
			target = input.nextLine().trim().toUpperCase();
		}
		else if(BattleMode.health1 > 0 && BattleMode.health2 <= 0 && BattleMode.health3 <= 0) {
			Typewriter.type("Who would you like to attack? Currently alive enemies are:");
			Typewriter.type( enemy1 );
			Typewriter.type("Chose one: ENEMY1 ");
			target = input.nextLine().trim().toUpperCase();
		}
		else if(BattleMode.health1 <= 0 && BattleMode.health2 > 0 && BattleMode.health3 <= 0) {
			Typewriter.type("Who would you like to attack? Currently alive enemies are:");
			Typewriter.type( enemy2 );
			Typewriter.type("Chose one: ENEMY2");
			target = input.nextLine().trim().toUpperCase();
		}
		
			if(target.equals("ENEMY1"))
			{
				//Player attack
				attack = currentStats.getMagicAttack() + currentStats.getPhysicalAttack(); //adds physical and magic attack damages
				BattleMode.health1 -= attack;
				Typewriter.type("You did " + attack + " damage! Enemy health = " + BattleMode.health1);
				
				//Enemy attack
				attack = BattleMode.attack1;
				currentStats.setHealth(Math.max((currentStats.getHealth()-attack),0)); //removes user health
				Typewriter.type("The enemy did " + attack + " damage! Your health = " + currentStats.getHealth());
				Typewriter.type("");
			}
			else if(target.equals("ENEMY2"))
			{
				//Player attack
				attack = currentStats.getMagicAttack() + currentStats.getPhysicalAttack(); //adds physical and magic attack damages
				BattleMode.health2 -= attack;
				Typewriter.type("You did " + attack + " damage! Enemy health = " + BattleMode.health2);
				
				//Enemy attack
				attack = BattleMode.attack2;
				currentStats.setHealth(Math.max((currentStats.getHealth()-attack),0)); //removes user health	
				Typewriter.type("The enemy did " + attack + " damage! Your health = " + currentStats.getHealth());
				Typewriter.type("");
			}
			else if(target.equals("ENEMY3"))
			{
				//Player attack
				attack = currentStats.getMagicAttack() + currentStats.getPhysicalAttack(); //adds physical and magic attack damages
				BattleMode.health3 -= attack;
				System.out.println("You did " + attack + " damage! Enemy health = " + BattleMode.health3);
				
				//Enemy attack
				attack = BattleMode.attack3;
				currentStats.setHealth(Math.max((currentStats.getHealth()-attack),0)); //removes user health	
				Typewriter.type("The enemy did " + attack + " damage! Your health = " + currentStats.getHealth());
				Typewriter.type("");
			}
		
	}
	public static ArrayList<GameCharacter> getCharacters(Party party){
		
		ArrayList<GameCharacter> characters = new ArrayList<>();
		
		for(GameCharacter character : party.getParty()) {
			characters.add(character);
		}
		return characters;
	}
	
	
	
	
}