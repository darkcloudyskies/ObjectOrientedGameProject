package character;

import GameClasses.GameClass;
import equipment.*;

import java.util.Scanner;

public class GameCharacter
{
    private String name;

    private EquipmentSet equipment;
    private GameClass gameClass;

    public GameCharacter()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of your character?");
        String name = input.nextLine();

        gameClass = GameClass.getGameClassFromPlayer();
    }

    public String getName()
    {
        return name;
    }

    public Stats getStats()
    {
        return new Stats();
    }


}
