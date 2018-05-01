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
        int MaxNumOfGameCharacters = chooseVersusMode();

        Scanner input = new Scanner(System.in);
        ArrayList<Party> parties = new ArrayList<>();

        // Add two initial parties
        // For if there are not at least two...there isn't really a game
        parties.add(new Party(MaxNumOfGameCharacters));
        parties.add(new Party(MaxNumOfGameCharacters));
        while(true)
        {
            Typewriter.type("Would you like to add another party? Y/N");
            String answer = input.nextLine().trim().toUpperCase();
            if(answer.equals("Y")||answer.equals("YES"))
            {
                parties.add(new Party(MaxNumOfGameCharacters));
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

    private int chooseVersusMode(){
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Which party size would you like to play?");
            System.out.println("Options: 1v1, 2v2, 3v3");

            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("1v1")) {
                return 1;
            } else if (answer.equalsIgnoreCase("2v2")) {
                return 2;
            } else if (answer.equalsIgnoreCase("3v3")) {
                return 3;
            } else {
                System.out.println("Invalid Versus Type!");
            }
        }

    }
}
