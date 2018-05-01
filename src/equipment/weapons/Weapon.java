package equipment.weapons;

import GameClasses.GameClass;
import GameClasses.MageClass;
import GameClasses.WarriorClass;

public class Weapon
{
    private GameClass weaponGameClass;
    private String name;
    private int damage;
    private int durability;

    public Weapon (GameClass weaponGameClass, String nameOfWeapon, int damage, int durability){
        this.weaponGameClass = weaponGameClass;
        this.name = nameOfWeapon;
        this.damage = damage;
        this.durability = durability;
    }

    public GameClass getWeaponGameClass() {
        return weaponGameClass;
    }

    public void detoriate(){
        durability--;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponGameClass=" + weaponGameClass.getClass().getSimpleName() +
                ", name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }

    public static void main(String[] args) {
        Weapon weapon = new Weapon(new MageClass(), "Staff",55, 15);
        System.out.println(weapon);



        if (weapon.getWeaponGameClass() instanceof WarriorClass){
            System.out.println("This is a magic weapon!");
        }
    }

    public int getDurability() {
        return durability;
    }
}


