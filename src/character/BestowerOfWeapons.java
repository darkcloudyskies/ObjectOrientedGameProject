package character;

import GameClasses.GameClass;
import equipment.weapons.Weapon;
import equipment.weapons.WeaponFactory;

import java.util.Random;

public class BestowerOfWeapons {
    private int counter;
    private Random randomNum;
    private final int MAX_NUM_OF_TURNS;

    public BestowerOfWeapons(int maxTurns){
        MAX_NUM_OF_TURNS = maxTurns;
        randomNum = new Random();
        resetCounter();
    }

    public void resetCounter(){
        counter = 2 + randomNum.nextInt(MAX_NUM_OF_TURNS);
    }

    public void counterTick(){
        counter--;
    }

    public Weapon bestowWeaponToPlayer(GameClass gameclass){
        resetCounter();
        return new WeaponFactory().makeNewRandomWeapon(gameclass);
    }

    public boolean isTheTimeRipe() {
        return counter == 0;
    }
}