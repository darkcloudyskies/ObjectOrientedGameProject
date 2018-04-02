package GameClasses;

import character.Stats;

import java.util.Scanner;

public abstract class GameClass
{
    protected Stats stats;
    protected Stats statMultiplier;

    public abstract Stats getStats();
    public abstract void specialMove();

    public static GameClass getGameClassFromPlayer()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Which class do you want to be? Choices are Mage, Rogue, Warrior.");

        while(true)
        {
            String choice = input.nextLine().trim().toUpperCase();

            switch (choice)
            {
                case ("MAGE"):
                    return new MageClass();
                case ("WARRIOR"):
                    return new WarriorClass();
                case ("ROGUE"):
                    return new RogueClass();
            }

            System.out.println("Invalid Answer.");
        }

    }

    public void levelUp()
    {
        Stats.add(stats,statMultiplier);
        stats.setHealth(stats.getMaxHealth());
        stats.setMana(stats.getMaxMana());
    }
}
