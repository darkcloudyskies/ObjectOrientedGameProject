package events;

import character.GameCharacter;
import character.Party;

import java.util.ArrayList;
import java.util.Scanner;

public class Battle
{
    public static void startBattle(ArrayList<Party> parties)
    {
        ArrayList<GameCharacter> characters = getCharactersFromParties(parties);

        while(true)
        {
            for(GameCharacter character : characters)
            {
                if(numPartiesAlive(parties)==1)
                {
                    Party winner = getFirstPartyAlive(parties);
                    System.out.println(winner.getName() + " has won the game!");
                    break;
                }
                if(!character.isAlive())
                {
                    continue;
                }

                System.out.println("It is currently " + character.getName() + "'s turn.");

                getAttackFromPlayer(character,parties);

            }
        }
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
        return new ArrayList<GameCharacter>();
    }

    private static int numPartiesAlive(ArrayList<Party> parties)
    {
        int numAlive = 0;
        for(Party party : parties)
        {
            if(party.isAlive())
            {
                numAlive++;
            }
        }
        return numAlive;
    }

    private static Party getFirstPartyAlive(ArrayList<Party> parties)
    {
        int numAlive = 0;
        for(Party party : parties)
        {
            if(party.isAlive())
            {
                return party;
            }
        }
        return null;
    }

    private static ArrayList<Party> getEnemyParties(GameCharacter character,ArrayList<Party> parties )
    {
        ArrayList<Party> enemyParties = new ArrayList<>();
        for(Party party : parties)
        {
            if(!party.getParty().contains(character))
            {
                enemyParties.add(party);
            }
        }
        return enemyParties;
    }

    private static void getAttackFromPlayer(GameCharacter character, ArrayList<Party> parties)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Party> enemyParties = getEnemyParties(character,parties);
        ArrayList<GameCharacter> enemies = getCharactersFromParties(enemyParties);

        while(true)
        {
            System.out.println("Who would you like to attack? Currently alive enemies are:");
            System.out.println(enemyParties.toString());
            String target = input.nextLine().trim();

            if(enemies.contains(new GameCharacter(target)))
            {
                GameCharacter enemy = enemies.get(enemies.indexOf(new GameCharacter(target)));
                character.attack(enemy);
            }
            else
            {
                System.out.println("Target not found!");
            }
        }
    }

}
