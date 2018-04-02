package character;

import java.util.ArrayList;
import java.util.Scanner;

public class Party
{
    private String name;
    private ArrayList<GameCharacter> party;

    public Party()
    {
        getNameFromPlayer();
        getCharactersFromPlayer();
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

    private void getNameFromPlayer()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of this party.");
        this.name = input.nextLine().trim();
    }

    private void getCharactersFromPlayer()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first character in this party.");
        party.add(new GameCharacter());
        while(true)
        {
            System.out.println("Do you wish to add another character to this party? Y/N");
            String answer = input.nextLine().trim().toUpperCase();
            if(answer.equals("Y")||answer.equals("YES"))
            {
                party.add(new GameCharacter());
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
    }

}
