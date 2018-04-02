package events;

import character.GameCharacter;
import character.Party;

import java.util.ArrayList;

public class Battle
{
    public static void startBattle(ArrayList<Party> parties)
    {
        ArrayList<GameCharacter> characters = getCharactersFromParties(parties);
    }

    private static ArrayList<GameCharacter> getCharactersFromParties(ArrayList<Party> parties)
    {
        ArrayList<GameCharacter> characters = new ArrayList<>();
        for(Party party: parties)
        {
            for(GameCharacter character : party.getParty())
            {
                characters.add(character);
            }
        }
    }

}
