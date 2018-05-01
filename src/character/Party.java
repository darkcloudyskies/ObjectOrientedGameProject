package character;

import dialogue.Typewriter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class Party
{
    private String name;
    private ArrayList<GameCharacter> party;

    public Party(int maxPartyMembers)
    {
        getNameFromPlayer();
        getCharactersFromPlayer(maxPartyMembers);
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<GameCharacter> getParty()
    {
        return party;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setParty(ArrayList<GameCharacter> party)
    {
        this.party = party;
    }

    public boolean isAlive()
    {
        boolean isAlive = false;
        for(GameCharacter character : party)
        {
            if (character.isAlive()){
                isAlive = true;
            }
        }
        return isAlive;
    }

    private void getNameFromPlayer()
    {
        Scanner input = new Scanner(System.in);

        Typewriter.type("Please enter the name of this party.");
        this.name = input.nextLine().trim();
    }

    private void getCharactersFromPlayer(int maxPartyMembers)
    {
        party = new ArrayList<GameCharacter>();
        Typewriter.type("Please enter the first character in this party.");
        party.add(new GameCharacter());

        for (int counter = 1; counter < maxPartyMembers; counter++){
            System.out.println("Add party member number " + (counter + 1));
            party.add(new GameCharacter());
        }
    }

    @Override public String toString()
    {
        String partyList = "";

        int counter = 0;
        for (GameCharacter character : party){
            if (character.isAlive()) {
                partyList += (counter++ > 0 ? ", " : "") + character.toString();
            }
        }
        return partyList;
    }

}
