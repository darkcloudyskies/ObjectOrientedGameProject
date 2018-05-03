package events;

import character.GameCharacter;
import character.Party;
import dialogue.Typewriter;
import events.Battle;
import stories.Galaxy;


import java.util.ArrayList;
import java.util.Scanner;

public class PveGame extends GameMode
{
	static int numCharacters = 0;
	String charNames;
	String partyName;
	int partySize;
	
    @Override
    public void startGame()
    {
    	  Scanner input = new Scanner(System.in);
          Typewriter.type("Please enter the number of players in your party. (ex. 3)");
          partySize = input.nextInt();
    	  Party party = new Party(partySize);
    	
    	System.out.println( "Test" );
    	charNames = party.toString();
    	System.out.println(charNames);
    	System.out.println(party.getName());
    	
		//randomly pick a story
    	Galaxy.startGalaxy(party);
    	
    }

}
