package stories;

import character.Party;

public class Galaxy {
	private static String enemy1 = "Alien Leader";
	private static String enemy2 = "Alien Lackey 1";
	private static String enemy3 = "Alien Lackey 2";
	
	public static void startGalaxy(Party party){
		System.out.println("stories.Galaxy StoryMode Chosen");
		System.out.println(" "); //create story
		BattleMode.StartBattle(party, enemy1, enemy2, enemy3);
		System.out.println("Game Complete");

	}
}
