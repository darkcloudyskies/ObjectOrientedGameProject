package equipment.weapons;

import GameClasses.GameClass;
import GameClasses.MageClass;
import GameClasses.RogueClass;
import GameClasses.WarriorClass;

import java.util.Random;

/**
 * Created by awest on 4/24/2018.
 */
public class WeaponFactory {
    private String[] warriorWeapons = {"Spear", "Hammer", "Sword"};
    private String[] mageWeapons = {"Wand", "Staff", "Spell Book"};
    private String[] rogueWeapons = {"Mace", "Axe", "Dagger"};
    private Random randGen;
    private final int MIN_DAMAGE = 5;
    private final int MAX_DAMAGE = 20;
    private final int MAX_DURABILITY = 3;

    public WeaponFactory(){ randGen = new Random(); }

    public Weapon makeNewRandomWeapon(GameClass gameClass){

        String weaponName = "";
        int damage = MIN_DAMAGE + randGen.nextInt(MAX_DAMAGE - MIN_DAMAGE);
        if (gameClass instanceof MageClass){
            weaponName = mageWeapons[randGen.nextInt(mageWeapons.length)];
            damage += 15;
        }else if(gameClass instanceof RogueClass){
            weaponName = rogueWeapons[randGen.nextInt(rogueWeapons.length)];
            damage += 5;
        }else if(gameClass instanceof WarriorClass){
            weaponName = warriorWeapons[randGen.nextInt(warriorWeapons.length)];
            damage += 10;
        }

        return new Weapon(gameClass,weaponName, damage, 1 + randGen.nextInt(MAX_DURABILITY));
    }
}
