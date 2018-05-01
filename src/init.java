import dialogue.Typewriter;
import events.GameMode;

public class init
{
    public static void main(String args[])
    {
        //System.out.println("Welcome to our game!");
        Typewriter.type("Welcome to our game!");

        GameMode mode = GameMode.getGameModeFromPlayer();
        mode.startGame();
    }
}
