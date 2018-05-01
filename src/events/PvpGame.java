package events;

import character.GameCharacter;
import character.Party;
import dialogue.Typewriter;

import java.util.ArrayList;
import java.util.Scanner;

public class PvpGame extends GameMode
{
    public void startGame()
    {
        ArrayList<Party> parties = getPartiesFromPlayer();
        Battle.startBattle(parties);
    }

    private ArrayList<Party> getPartiesFromPlayer()
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Party> parties = new ArrayList<>();
        parties.add(new Party());
        parties.add(new Party());
        while(true)
        {
            Typewriter.type("Would you like to add another party? Y/N");
            String answer = input.nextLine().trim().toUpperCase();
            if(answer.equals("Y")||answer.equals("YES"))
            {
                parties.add(new Party());
            }
            else if(answer.equals("N")||answer.equals("NO"))
            {
                break;
            }
            else
            {
                Typewriter.type("Invalid answer.");
            }
        }
        return parties;
    }
}
