package equipment.weapons;

import GameClasses.GameClass;
import GameClasses.MageClass;
import GameClasses.WarriorClass;

public class Weapon
{
    private GameClass weaponGameClass;
    private String name;

    public Weapon (GameClass weaponGameClass, String nameOfWeapon){
        this.weaponGameClass = weaponGameClass;
        this.name = nameOfWeapon;
    }

    public GameClass getWeaponGameClass() {
        return weaponGameClass;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Weapon{" +
                "weaponGameClass=" + weaponGameClass +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Weapon weapon = new Weapon(new MageClass(), "Staff");
        System.out.println(weapon);

        if (weapon.getWeaponGameClass() instanceof WarriorClass){
            System.out.println("This is a magic weapon!");
        }
    }

}


