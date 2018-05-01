package events;

import character.BestowerOfWeapons;
import character.GameCharacter;
import character.Party;
import com.sun.xml.internal.txw2.TypedXmlWriter;
import dialogue.Typewriter;
import equipment.weapons.WeaponFactory;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Battle
{
    private static BestowerOfWeapons bestowerOfWeapons;
    public static void startBattle(ArrayList<Party> parties)
    {
        bestowerOfWeapons = new BestowerOfWeapons(3);
        ArrayList<GameCharacter> characters = getCharactersFromParties(parties);

        outerLoop:
        while(true)
        {
            for(GameCharacter character : characters)
            {
                if(numPartiesAlive(parties)==1)
                {
                    Party winner = getFirstPartyAlive(parties);
                    Typewriter.typeFast("The " + winner.getName() + " party has won the game!");
                    break outerLoop;
                }
                else if(numPartiesAlive(parties)<1)
                {
                    Typewriter.typeFast("Somehow all parties are dead, nobody won!");
                    break outerLoop;
                }
                if(!character.isAlive())
                {
                    continue;
                }

                Typewriter.typeFast("It is currently " + character.getName() + "'s turn.");

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
        return characters;
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
            Typewriter.typeFast("Who would you like to attack? Currently alive enemies are:");
            Typewriter.typeFast(enemyParties.toString());
            String target = input.nextLine().trim();

            if(enemies.contains(new GameCharacter(target)))
            {
                bestowerOfWeapons.counterTick();
                if (bestowerOfWeapons.isTheTimeRipe()){
                    if (character.getWeapon() == null) {
                        character.setWeapon(bestowerOfWeapons.bestowWeaponToPlayer(character.getGameClass()));
                        Typewriter.typeSlow("\n.....Oh? The GREAT BESTOWER HAS ARRIVED!");
                        Typewriter.type(character.getName() + " received the " +
                                character.getWeapon().getName() + " from the GREAT BESTOWER! Attack damage increased!\n");
                    }else{
                        bestowerOfWeapons.resetCounter();
                    }
                }
                GameCharacter enemy = enemies.get(enemies.indexOf(new GameCharacter(target)));
                character.attack(enemy);

                if (character.getWeapon() != null) {
                    character.getWeapon().detoriate();
                    if (character.getWeapon().getDurability() == 0) {
                        Typewriter.type("Oh no! " + character.getName() + "\'s " +
                                character.getWeapon().getName() + " broke! Attack damage reduced.");
                        character.destroyWeapon();
                    }
                }
                break;
            }
            else
            {
                Typewriter.typeFast("Target not found!");
            }
        }
    }

}
