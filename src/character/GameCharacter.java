package character;

import GameClasses.GameClass;
import equipment.*;
import equipment.weapons.Weapon;
import equipment.weapons.WeaponFactory;

import java.util.Scanner;

public class GameCharacter
{
    private String name;

    private EquipmentSet equipment;
    private GameClass gameClass;
    private Weapon weapon;

    public GameCharacter()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of your character?");
        name = input.nextLine();

        gameClass = GameClass.getGameClassFromPlayer();
        weapon = new WeaponFactory().makeNewRandomWeapon(gameClass);
        System.out.println(name + " received the weapon " + weapon.getName());
    }

    public GameCharacter(String name)
    {
        this.name = name;
    }

    public boolean isAlive()
    {
        return gameClass.getStats().getHealth() > 0;
    }

    public String getName()
    {
        return name;
    }

    public Stats getStats()
    {
        return new Stats();
    }

    public GameClass getGameClass()
    {
        return gameClass;
    }

    public void attack(GameCharacter enemy)
    {
        Stats curreStats = this.getGameClass().getStats();
        Stats enemyStats = enemy.getGameClass().getStats();

        int damage = 0;

        damage += Math.max(curreStats.getMagicAttack() - enemyStats.getMagicDefence(),0);
        damage += Math.max(curreStats.getPhysicalAttack() - enemyStats.getPhysicalDefence(),0);

        enemyStats.setHealth(Math.max((enemyStats.getHealth()-damage),0));

        System.out.println("Did " + damage + " damage!");
        System.out.println(enemy.getName() + " has " + enemyStats.getHealth() + " health left!");
    }

    @Override
    public String toString()
    {
        return this.name;
    }

    @Override
    public boolean equals(Object other)
    {
        return this.name.equals(((GameCharacter)other).name);
    }


}
