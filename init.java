import java.util.Scanner;

import dialogue.Typewriter;
import events.GameMode;
import events.Information;



public class init
{
    public static void main(String args[])
    {
    	Scanner input = new Scanner(System.in);
    	
    	//System.out.println("Welcome to our game!");
        Typewriter.type("Welcome to our game!");
        Typewriter.type("Would you like to view information about our game? Y/N");
        
        boolean done = false;
        
        while(done == false) {
        	
            String info = input.nextLine().trim().toUpperCase();
        	
	        switch (info)
	        {
	        	case "Y":
	        	case "YES":
	        		getInfo();
	        		done = true;
	        		break;
	        		
	        	case "N":
	        	case "NO":
	        		done = true;
	        		break;
	        		
	        	default:
	        		Typewriter.type("What? Type YES or NO.");
	        }
        }
        

        GameMode mode = GameMode.getGameModeFromPlayer();
        mode.startGame();
    }
    
    public static void getInfo() {
		Scanner input = new Scanner(System.in);
		
		boolean done2 = false;
		
		Typewriter.typeFast("To learn about a specific part of our game, type out one of the options listed below.");
		Typewriter.typeFast("When you are finished and ready to play, type DONE.");
		
		while (done2 == false)
		{
			Typewriter.type("-Gamemodes");
			Typewriter.type("-Classes");
			Typewriter.type("-Weapons");
			Typewriter.type("-Done");
			
			
			String topic = input.nextLine().trim().toLowerCase();
			switch (topic) {
				case "gamemodes":
					Information.getGameModeInfo();
					break;
				case "classes":
					Information.getClassInfo();
					break;
				case "weapons":
					Information.getWeaponInfo();
					break;
				case "done":
					done2 = true;
					break;
					default:
					Typewriter.type("What? Please enter one of the options listed.");
			}
		}
	}
    
}
