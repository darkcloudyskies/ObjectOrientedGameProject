package stories;

import character.Party;
import dialogue.Typewriter;

public class Galaxy {
	private static String enemy1 = "Alien Leader";
	private static String enemy2 = "Alien Lackey 1";
	private static String enemy3 = "Alien Lackey 2";
	static String charNames;
	static String partyName;
	
	public static void startGalaxy(Party party){
		charNames = party.toString();
		partyName = party.getName();
		
		Typewriter.type("Galaxy StoryMode Chosen");
		Typewriter.type(" ");
		Typewriter.type(partyName + " have traveled to planet Mars looking for a habitable location.");
		Typewriter.type("While traveling " + partyName + " run into a group of aliens.");
		Typewriter.type(partyName + " tried to talk to the aliens, but they can't understand you.");
		Typewriter.type("The aliens look offended by something you said and get ready for battle!");
		Typewriter.type(" ");
		BattleMode.StartBattle(party, enemy1, enemy2, enemy3);
		Typewriter.type("Game Complete");

	}
}
