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

    public WeaponFactory(){ randGen = new Random(); }

    public Weapon makeNewRandomWeapon(GameClass gameClass){

        String weaponName = "";
        if (gameClass instanceof MageClass){
            weaponName = mageWeapons[randGen.nextInt(mageWeapons.length)];
        }else if(gameClass instanceof RogueClass){
            weaponName = rogueWeapons[randGen.nextInt(rogueWeapons.length)];
        }else if(gameClass instanceof WarriorClass){
            weaponName = warriorWeapons[randGen.nextInt(warriorWeapons.length)];
        }

        return new Weapon(gameClass,weaponName);
    }
}
