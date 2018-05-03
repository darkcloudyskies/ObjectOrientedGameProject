package events;
import java.util.Scanner;
import dialogue.Typewriter;


public class Information {
	
	public static void getGameModeInfo() {
		Typewriter.type("PVP is Player vs. Player (Party vs. Party). It can be 1v1, 2v2, or 3v3.");
		Typewriter.type("PVE is Player vs. Environment. Co-op with your friends. Recommended for 3 players.");
	}
	
	public static void getClassInfo() {
		Typewriter.typeSlow("Warrior");
		Typewriter.typeFast("Health: 175");
		Typewriter.typeFast("Physical Attack: 10");
		Typewriter.typeFast("Physical Defense: 10");
		Typewriter.typeFast("Magic Attack: 2");
		Typewriter.typeFast("Magic Defense: 2");
		
		Typewriter.typeSlow("Rogue");
		Typewriter.typeFast("Health: 175");
		Typewriter.typeFast("Physical Attack: 6");
		Typewriter.typeFast("Physical Defense: 6");
		Typewriter.typeFast("Magic Attack: 4");
		Typewriter.typeFast("Magic Defense: 4");
		
		Typewriter.typeSlow("Mage");
		Typewriter.typeFast("Health: 175");
		Typewriter.typeFast("Physical Attack: 2");
		Typewriter.typeFast("Physical Defense: 2");
		Typewriter.typeFast("Magic Attack: 10");
		Typewriter.typeFast("Magic Defense: 10");
		
	}
	
	public static void getWeaponInfo() {
		Typewriter.typeSlow("Warrior");
		Typewriter.typeFast("Spear, Hammer, Sword");
		
		Typewriter.typeFast("Min Damage: 15");
		Typewriter.typeFast("Max Damage: 30");
		Typewriter.typeFast("Max Durability: 4");
		
		Typewriter.typeSlow("Rogue");
		Typewriter.typeFast("Mace, Axe, Dagger");
		
		Typewriter.typeFast("Min Damage: 10");
		Typewriter.typeFast("Max Damage: 25");
		Typewriter.typeFast("Max Durability: 4");
		
		Typewriter.typeSlow("Mage");
		Typewriter.typeFast("Wand, Staff, Spell Book");
		
		Typewriter.typeFast("Min Damage: 20");
		Typewriter.typeFast("Max Damage: 35");
		Typewriter.typeFast("Max Durability: 4");
		
	}
	

}
