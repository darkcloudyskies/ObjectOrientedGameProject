package events;

import character.GameCharacter;
import character.Party;

import java.util.ArrayList;
import java.util.Scanner;

public class PvpGame extends GameMode
{
    public void startGame()
    {
        ArrayList<Party> parties = getPartiesFromPlayer();
    }

    private ArrayList<Party> getPartiesFromPlayer()
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Party> parties = new ArrayList<>();
        parties.add(new Party());
        parties.add(new Party());
        while(true)
        {
            System.out.println("Would you like to add another party? Y/N");
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
                System.out.println("Invalid answer.");
            }
        }
        return parties;
    }
}
