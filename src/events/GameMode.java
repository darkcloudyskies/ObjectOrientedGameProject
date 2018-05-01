package events;

import com.sun.xml.internal.txw2.TypedXmlWriter;
import dialogue.Typewriter;

import java.util.Scanner;

public abstract class GameMode
{
    public abstract void startGame();

    public static GameMode getGameModeFromPlayer()
    {
        Scanner input = new Scanner(System.in);

       Typewriter.type("Which gamemode do you wish to play? Choices are PVP or PVE");

        while(true)
        {
            String mode = input.nextLine().trim();
            switch (mode.toUpperCase())
            {
                case "PVE":
                    return new PveGame();
                case "PVP":
                    return new PvpGame();
            }
           Typewriter.type("Please enter a correct gamemode, acceptable modes are PVP or PVE");
        }
    }
}
